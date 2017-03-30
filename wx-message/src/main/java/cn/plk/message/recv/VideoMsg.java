/**
 * 
 */
package cn.plk.message.recv;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import cn.plk.cdata.CdataAdapter;
import cn.plk.message.RecvMsg;

/**
 * 视频消息 
 * <xml><MediaId><![CDATA[media_id]]></MediaId>
 * <ThumbMediaId><![CDATA[thumb_media_id]]></ThumbMediaId>
 * </xml>
 * 
 * @author {康培亮/AB052634}
 */

@XmlRootElement(name = "xml")
public class VideoMsg extends RecvMsg {

	private static final long serialVersionUID = 1L;

	private String mediaId;
	private String thumbMediaId;

	public String getMediaId() {
		return mediaId;
	}

	@XmlElement(name = "Content")
	@XmlJavaTypeAdapter(CdataAdapter.class)
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getThumbMediaId() {
		return thumbMediaId;
	}

	@XmlElement(name = "ThumbMediaId")
	@XmlJavaTypeAdapter(CdataAdapter.class)
	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}

	@Override
	public String toString() {
		return new StringBuffer().append(super.toString()).append("MediaId=").append(mediaId).append("ThumbMediaId=")
				.append(thumbMediaId).toString();
	}
}
