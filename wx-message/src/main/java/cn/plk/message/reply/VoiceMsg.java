/**
 * 
 */
package cn.plk.message.reply;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import cn.plk.message.ReplyMsg;

/**
<xml>
<ToUserName><![CDATA[toUser]]></ToUserName>
<FromUserName><![CDATA[fromUser]]></FromUserName>
<CreateTime>12345678</CreateTime>
<MsgType><![CDATA[voice]]></MsgType>
<Voice>
<MediaId><![CDATA[media_id]]></MediaId>
</Voice>
</xml>
 * @author {康培亮/AB052634}
 */

@XStreamAlias(value = "xml")
public class VoiceMsg extends ReplyMsg {
	
	private static final long serialVersionUID = 1L;
	
	@XStreamAlias(value = "Voice")
	private Media voice;
	
	public Media getVoice() {
		return voice;
	}

	public void setVoice(Media voice) {
		this.voice = voice;
	}
}
