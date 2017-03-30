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
<MsgType><![CDATA[image]]></MsgType>
<Image>
<MediaId><![CDATA[media_id]]></MediaId>
</Image>
</xml>
 * @author {康培亮/AB052634}
 */

@XStreamAlias(value = "xml")
public class ImageMsg extends ReplyMsg {
	
	private static final long serialVersionUID = 1L;
	
	@XStreamAlias(value = "Image")
	private Media image;
	
	public Media getImage() {
		return image;
	}

	public void setImage(Media image) {
		this.image = image;
	}
}
