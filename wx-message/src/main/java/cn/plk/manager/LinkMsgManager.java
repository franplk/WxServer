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
public class LinkMsgManager implements MsgDeploy {

	@Override
	public ReplyMsg perform(Map<String, String> xmlMap) {
		TextMsg textMsg = new TextMsg();
		
		textMsg.setContent(new StringBuffer("链接消息发送成功").append("\r\n")
				.append("链接标题：").append(xmlMap.get("Title")).append("\r\n")
				.append("链接描述：").append(xmlMap.get("Description")).append("\r\n")
				.append("链接地址：").append(xmlMap.get("Url"))
				.toString());

		return textMsg;
	}
}
