package cn.plk.server;

import java.io.InputStream;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import cn.plk.aes.AesException;
import cn.plk.aes.SHA1;
import cn.plk.exception.WxException;
import cn.plk.message.ReplyMsg;
import cn.plk.manager.MsgDeploy;
import cn.plk.manager.MsgDeployFactory;
import cn.plk.server.vo.VerifyBean;
import cn.plk.util.XmlUtil;

/**
 * @author {康培亮/AB052634}
 */
@Service
public class WxManager {

	private static final String TOKEN = "rabbit";

	/**
	 * @param vb
	 * @return
	 */
	public boolean checkSignature(VerifyBean vb) {
		try {
			String sha1Msg = SHA1.getSHA1(TOKEN, vb.getTimestamp(), vb.getNonce());
			String signature = vb.getSignature();
			if (sha1Msg.equals(signature)) {
				return true;
			}
		} catch (AesException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * @param xmlMsg
	 * @return
	 */
	public ReplyMsg getReplyMsg(String xmlMsg) {

		Map<String, String> xmlMap = XmlUtil.parser(xmlMsg);

		return getReplyMsg(xmlMap);
	}
	
	/**
	 * @param xmlMsg
	 * @return
	 */
	public ReplyMsg getReplyMsg(InputStream inputStream) {

		Map<String, String> xmlMap = XmlUtil.parser(inputStream);

		return getReplyMsg(xmlMap);
	}
	
	/**
	 * @param xmlMap
	 * @return
	 */
	public ReplyMsg getReplyMsg(Map<String, String> xmlMap) {

		String msgType = xmlMap.remove("MsgType");
		if (StringUtils.isEmpty(msgType)) {
			throw new WxException("无消息类型");
		}

		// 获取消息处理器
		MsgDeploy msgDeploy = MsgDeployFactory.create(msgType);

		// 公众号与用户帐号
		String fromUserName = xmlMap.remove("FromUserName");// 用户帐号
		String toUserName = xmlMap.remove("ToUserName");// 公众帐号

		// 生成回复的消息
		ReplyMsg msg = msgDeploy.perform(xmlMap);
		msg.setFromUserName(toUserName);
		msg.setToUserName(fromUserName);

		return msg;
	}
}
