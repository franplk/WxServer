/**
 * 
 */
package cn.plk.message;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author {康培亮/AB052634}
 *
 */

@XStreamAlias(value = "xml")
public class WxMsg implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@XStreamAlias(value = "ToUserName")
	protected String toUserName;
	
	@XStreamAlias(value = "FromUserName")
	protected String fromUserName;
	
	@XStreamAlias(value = "CreateTime")
	protected Long createTime;
	
	@XStreamAlias(value = "MsgType")
	protected String msgType;

	public WxMsg () {
	}
	
	public String getToUserName() {
		return toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getFromUserName() {
		return fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public Long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Long createTime) {
		this.createTime = createTime;
	}
	
	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	
	@Override
	public String toString () {
		return new StringBuffer()
				.append("toUserName=").append(toUserName).append(";")
				.append("fromUserName=").append(fromUserName).append(";")
				.append("createTime=").append(createTime).append(";")
				.append("msgType=").append(msgType).append(";")
				.toString();
	}
}
