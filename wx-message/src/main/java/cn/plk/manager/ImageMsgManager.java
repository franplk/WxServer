/**
 * 
 */
package cn.plk.manager;

import java.util.Map;

import cn.plk.message.ReplyMsg;
import cn.plk.message.reply.TextMsg;

/**
 * 对于客户端发送图片消息的处理逻辑
 * @author {康培亮/AB052634}
 */
public class ImageMsgManager implements MsgDeploy {

	@Override
	public ReplyMsg perform(Map<String, String> xmlMap) {
		
		TextMsg textMsg = new TextMsg();
		textMsg.setContent(new StringBuffer("图片发送成功").append("\r\n")
				.append("图片地址：").append(xmlMap.get("PicUrl")).append("\r\n")
				.append("媒介标识：").append(xmlMap.get("MediaId"))
				.toString());
		
		return textMsg;
	}
}
