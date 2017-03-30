/**
 * 
 */
package cn.plk.manager;

import java.util.Map;

import cn.plk.message.ReplyMsg;
import cn.plk.message.reply.TextMsg;

/**
 * 对于客户端上传地理位置消息的处理
 * @author {康培亮/AB052634}
 */
public class GeoMsgManager implements MsgDeploy {

	@Override
	public ReplyMsg perform(Map<String, String> xmlMap) {
		TextMsg textMsg = new TextMsg();

		textMsg.setContent(new StringBuffer()
				.append("位置信息：").append(xmlMap.get("Label"))
				.append("比例尺：").append(xmlMap.get("Scale"))
				.append("经度：").append(xmlMap.get("Location_X"))
				.append("纬度：").append(xmlMap.get("Location_Y"))
				.toString());

		return textMsg;
	}
}
