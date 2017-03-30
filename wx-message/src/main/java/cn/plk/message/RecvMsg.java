/**
 * 
 */
package cn.plk.message;

import javax.xml.bind.annotation.XmlElement;

/**
 * 微信端接收的消息基本类
 * @author {康培亮/AB052634}
 */
public class RecvMsg extends WxMsg {

	private static final long serialVersionUID = 1L;

	protected Long msgId;

	public Long getMsgId() {
		return msgId;
	}

	@XmlElement(name="MsgId")
	public void setMsgId(Long msgId) {
		this.msgId = msgId;
	}
	
	@Override
	public String toString () {
		return new StringBuffer()
				.append(super.toString())
				.append("msgId=").append(msgId).append(";")
				.toString();
	}
}
