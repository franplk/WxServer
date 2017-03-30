package cn.plk.manager;

import java.io.Serializable;

import cn.plk.message.MsgType;

/**
 * @author {康培亮/AB052634}
 */
public class MsgDeployFactory implements Serializable {

	private static final long serialVersionUID = 1L;

	private MsgDeployFactory() {
	}
	
	public static MsgDeploy create (String msgType) {
		
		MsgDeploy msgDeploy = null;
		
		if (msgType.equals(MsgType.REQ_MESSAGE_TYPE_TEXT)) {
			msgDeploy = new TextMsgManager();
		} else if (msgType.equals(MsgType.REQ_MESSAGE_TYPE_IMAGE)) {
			msgDeploy = new ImageMsgManager();
		} else if (msgType.equals(MsgType.REQ_MESSAGE_TYPE_LOCATION)) {
			msgDeploy = new GeoMsgManager();
		} else if (msgType.equals(MsgType.REQ_MESSAGE_TYPE_LINK)) {
			msgDeploy = new LinkMsgManager();
		} else if (msgType.equals(MsgType.REQ_MESSAGE_TYPE_VOICE)) {
			msgDeploy = new VoiceMsgManager();
		} else if (msgType.equals(MsgType.REQ_MESSAGE_TYPE_EVENT)) {
			msgDeploy = new EventMsgManager();
		}
		
		return msgDeploy;
	}

}
