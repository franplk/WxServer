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
<xml>
 <PicUrl><![CDATA[this is a url]]></PicUrl>
 <MediaId><![CDATA[media_id]]></MediaId>
</xml>
 * @author {康培亮/AB052634}
 *
 */

@XmlRootElement(name = "xml")
public class ImageMsg extends RecvMsg {

	private static final long serialVersionUID = 1L;
	
	private String picUrl;
	private String mediaId;

	public String getPicUrl() {
		return picUrl;
	}

	@XmlElement(name="MediaId")
	@XmlJavaTypeAdapter(CdataAdapter.class)
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getMediaId() {
		return mediaId;
	}

	@XmlElement(name="MediaId")
	@XmlJavaTypeAdapter(CdataAdapter.class)
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	
	@Override
	public String toString () {
		return new StringBuffer()
				.append(super.toString())
				.append("MediaId=").append(mediaId)
				.append("PicUrl=").append(picUrl)
				.toString();
	}

}
