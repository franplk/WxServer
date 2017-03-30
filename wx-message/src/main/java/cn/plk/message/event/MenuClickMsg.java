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
 * 公众号自定义菜单事件
<xml>
<ToUserName><![CDATA[toUser]]></ToUserName>
<FromUserName><![CDATA[FromUser]]></FromUserName>
<CreateTime>123456789</CreateTime>
<MsgType><![CDATA[event]]></MsgType>
<Event><![CDATA[CLICK]]></Event>
<EventKey><![CDATA[EVENTKEY]]></EventKey>
</xml>
 * @author {康培亮/AB052634}
 */

@XmlRootElement(name = "xml")
public class MenuClickMsg extends EventMsg {


	private static final long serialVersionUID = 1L;

	private String eventKey;

	public String getEventKey() {
		return eventKey;
	}

	@XmlElement(name="EventKey")
	@XmlJavaTypeAdapter(CdataAdapter.class)
	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}

	@Override
	public String toString () {
		return new StringBuffer()
				.append(super.toString())
				.append("EventKey=").append(eventKey).append(";")
				.toString();
	}
}
