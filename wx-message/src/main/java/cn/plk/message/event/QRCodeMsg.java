/**
 * 
 */
package cn.plk.message.event;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import cn.plk.cdata.CdataAdapter;
import cn.plk.message.EventMsg;

/**
 * 二维码扫描消息
<xml><ToUserName><![CDATA[toUser]]></ToUserName>
<FromUserName><![CDATA[FromUser]]></FromUserName>
<CreateTime>123456789</CreateTime>
<MsgType><![CDATA[event]]></MsgType>
<Event><![CDATA[subscribe]]></Event>
<EventKey><![CDATA[qrscene_123123]]></EventKey>
<Ticket><![CDATA[TICKET]]></Ticket>
</xml>
 * @author {康培亮/AB052634}
 */

@XmlRootElement(name = "xml")
public class QRCodeMsg extends EventMsg {

	private static final long serialVersionUID = 1L;

	private String eventKey;
	private String ticket;

	public String getEventKey() {
		return eventKey;
	}

	@XmlElement(name="EventKey")
	@XmlJavaTypeAdapter(CdataAdapter.class)
	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}

	public String getTicket() {
		return ticket;
	}

	@XmlElement(name="Ticket")
	@XmlJavaTypeAdapter(CdataAdapter.class)
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString () {
		return new StringBuffer()
				.append(super.toString())
				.append("Event=").append(event)
				.append("EventKey=").append(eventKey).append(";")
				.append("Ticket=").append(ticket).append(";")
				.toString();
	}
}