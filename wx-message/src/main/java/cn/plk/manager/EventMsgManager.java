package cn.plk.manager;

import java.util.Map;

import cn.plk.message.MsgType;
import cn.plk.message.ReplyMsg;
import cn.plk.message.reply.TextMsg;

/**
 * 对于客户端事件/菜单消息的处理逻辑
 * 
 * @author {康培亮/AB052634}
 */
public class EventMsgManager implements MsgDeploy {

	@Override
	public ReplyMsg perform(Map<String, String> xmlMap) {
		TextMsg textMsg = new TextMsg();

		String eventType = xmlMap.get("Event");// 事件类型
		String eventName = getEventName(eventType);

		String eventKey = xmlMap.get("EventKey");
		textMsg.setContent(new StringBuffer().append("事件类型")
				.append(eventName).append("\r\n")
				.append("事件Key值：")
				.append(eventKey)
				.toString());

		return textMsg;
	}

	private String getEventName(String eventType) {
		String name = null;
		// 自定义菜单点击事件
		if (eventType.equals(MsgType.EVENT_TYPE_CLICK)) {
			name = "菜单点击事件";
		} else if (eventType.equals(MsgType.EVENT_TYPE_VIEW)) {
			name = "菜单URL事件";
		} else if (eventType.equals(MsgType.EVENT_TYPE_SCAN)) {
			name = "二维码扫描事件";
		} else if (eventType.equals(MsgType.EVENT_TYPE_SUBSCRIBE)) {
			name = "订阅事件";
		} else if (eventType.equals(MsgType.EVENT_TYPE_UNSUBSCRIBE)) {
			name = "取消订阅事件";
		} else if (eventType.equals(MsgType.EVENT_TYPE_UNSUBSCRIBE)) {
			name = "上报地理位置事件";
		}

		return name;
	}
}
