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
 * <xml> <MediaId><![CDATA[media_id]]></MediaId>
 * <Format><![CDATA[Format]]></Format> </xml>
 * 
 * @author {康培亮/AB052634} 语音消息
 */

@XmlRootElement(name = "xml")
public class VoiceMsg extends RecvMsg {

	private static final long serialVersionUID = 1L;

	private String mediaId;
	private String format;

	public String getMediaId() {
		return mediaId;
	}

	@XmlElement(name="MediaId")
	@XmlJavaTypeAdapter(CdataAdapter.class)
	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getFormat() {
		return format;
	}

	@XmlElement(name="Format")
	@XmlJavaTypeAdapter(CdataAdapter.class)
	public void setFormat(String format) {
		this.format = format;
	}
	
	@Override
	public String toString () {
		return new StringBuffer()
				.append(super.toString())
				.append("MediaId=").append(mediaId)
				.append("Format=").append(format)
				.toString();
	}
}
