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
<MsgType><![CDATA[video]]></MsgType>
<Video>
<MediaId><![CDATA[media_id]]></MediaId>
<Title><![CDATA[title]]></Title>
<Description><![CDATA[description]]></Description>
</Video> 
</xml>
 * @author {康培亮/AB052634}
 */

@XStreamAlias(value = "xml")
public class VideoMsg extends ReplyMsg {

	private static final long serialVersionUID = 1L;
	
	@XStreamAlias(value = "Video")
	private Media video;
	
	public Media getVideo() {
		return video;
	}

	public void setVideo(Media video) {
		this.video = video;
	}

}
