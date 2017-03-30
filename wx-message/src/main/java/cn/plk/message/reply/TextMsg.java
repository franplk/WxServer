/**
 * 
 */
package cn.plk.message.reply;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import cn.plk.message.MsgType;
import cn.plk.message.ReplyMsg;

/**
 * <xml> <ToUserName><![CDATA[toUser]]></ToUserName>
 * <FromUserName><![CDATA[fromUser]]></FromUserName>
 * <CreateTime>12345678</CreateTime> <MsgType><![CDATA[text]]></MsgType>
 * <Content><![CDATA[你好]]></Content> </xml>
 * 
 * @author {康培亮/AB052634}
 */

@XStreamAlias(value = "xml")
public class TextMsg extends ReplyMsg {

	private static final long serialVersionUID = 1L;

	@XStreamAlias(value = "Content")
	private String content;

	public TextMsg() {
		this.msgType = MsgType.REQ_MESSAGE_TYPE_TEXT;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return new StringBuffer().append(super.toString())
				.append("content=").append(content).toString();
	}
}
