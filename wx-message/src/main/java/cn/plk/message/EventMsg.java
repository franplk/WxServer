/**
 * 
 */
package cn.plk.message;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import cn.plk.cdata.CdataAdapter;

/**
 * <xml> <ToUserName><![CDATA[toUser]]></ToUserName>
 * <FromUserName><![CDATA[FromUser]]></FromUserName>
 * <CreateTime>123456789</CreateTime> <MsgType><![CDATA[event]]></MsgType>
 * <Event><![CDATA[subscribe]]></Event> </xml>
 * 
 * @author {康培亮/AB052634}
 */
public class EventMsg extends WxMsg {

	private static final long serialVersionUID = 1L;

	protected String event;

	public EventMsg() {
	}

	public String getEvent() {
		return event;
	}

	@XmlElement(name = "Event")
	@XmlJavaTypeAdapter(CdataAdapter.class)
	public void setEvent(String event) {
		this.event = event;
	}

	@Override
	public String toString() {
		return new StringBuffer().append(super.toString())
				.append("Event=").append(event).toString();
	}
}
