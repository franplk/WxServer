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
public class TextMsgManager implements MsgDeploy {

	@Override
	public ReplyMsg perform(Map<String, String> xmlMap) {
		
		TextMsg textMsg = new TextMsg();
		String respContent = xmlMap.get("Content");
		textMsg.setContent("消息:" + respContent);

		return textMsg;
	}
}
