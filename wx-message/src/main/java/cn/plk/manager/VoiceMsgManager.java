/**
 * 
 */
package cn.plk.manager;

import java.util.Map;

import cn.plk.message.ReplyMsg;
import cn.plk.message.reply.TextMsg;

/**
 * 对于客户端文本消息的处理逻辑
 * @author {康培亮/AB052634}
 */
public class VoiceMsgManager implements MsgDeploy {

	@Override
	public ReplyMsg perform(Map<String, String> xmlMap) {
		TextMsg textMsg = new TextMsg();
		
		textMsg.setContent(new StringBuffer("音频消息发送成功").append("\r\n")
				.append("音频ID：").append(xmlMap.get("MediaId")).append("\r\n")
				.append("音频格式：").append(xmlMap.get("Format"))
				.toString());

		return textMsg;
	}
}
