package cn.plk.message;

import java.io.Serializable;

/**
 * @author {康培亮/AB052634}
 *
 */
public class MsgType implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 回复消息类型
	 */
	public static final String RESP_MESSAGE_TYPE_TEXT = "text";
	public static final String RESP_MESSAGE_TYPE_MUSIC = "music";
	public static final String RESP_MESSAGE_TYPE_NEWS = "news";

	/**
	 * 接收消息类型
	 */
	public static final String REQ_MESSAGE_TYPE_TEXT = "text";
	public static final String REQ_MESSAGE_TYPE_IMAGE = "image";
	public static final String REQ_MESSAGE_TYPE_LINK = "link";
	public static final String REQ_MESSAGE_TYPE_LOCATION = "location";
	public static final String REQ_MESSAGE_TYPE_VOICE = "voice";
	public static final String REQ_MESSAGE_TYPE_EVENT = "event";

	/**
	 * 事件类型
	 */
	public static final String EVENT_TYPE_REPORTLOCATION = "LOCATION";
	public static final String EVENT_TYPE_SUBSCRIBE = "subscribe";
	public static final String EVENT_TYPE_UNSUBSCRIBE = "unsubscribe";
	public static final String EVENT_TYPE_SCAN = "SCAN";
	public static final String EVENT_TYPE_CLICK = "CLICK";
	public static final String EVENT_TYPE_VIEW = "VIEW";
}
