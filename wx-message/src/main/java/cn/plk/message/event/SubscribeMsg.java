package cn.plk.message.event;

import javax.xml.bind.annotation.XmlRootElement;

import cn.plk.message.EventMsg;

/**
 * 公众号关注/取消 消息
<xml>
<ToUserName><![CDATA[toUser]]></ToUserName>
<FromUserName><![CDATA[FromUser]]></FromUserName>
<CreateTime>123456789</CreateTime>
<MsgType><![CDATA[event]]></MsgType>
<Event><![CDATA[subscribe]]></Event>
</xml>
 * @author {康培亮/AB052634}
 */

@XmlRootElement(name = "xml")
public class SubscribeMsg extends EventMsg {

	private static final long serialVersionUID = 1L;

	@Override
	public String toString () {
		return super.toString();
	}
}
