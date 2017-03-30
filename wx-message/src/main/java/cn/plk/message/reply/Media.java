/**
 * 
 */
package cn.plk.message.reply;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * @author {康培亮/AB052634}
 *
 */

public class Media implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@XStreamAlias(value = "MediaId")
	private String mediaId;
	
	@XStreamAlias(value = "Title")
	private String title;
	
	@XStreamAlias(value = "Description")
	private String description;

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
