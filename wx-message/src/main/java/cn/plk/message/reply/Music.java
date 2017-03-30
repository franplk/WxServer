/**
 * 
 */
package cn.plk.message.reply;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
<Music>
<Title><![CDATA[TITLE]]></Title>
<Description><![CDATA[DESCRIPTION]]></Description>
<MusicUrl><![CDATA[MUSIC_Url]]></MusicUrl>
<HQMusicUrl><![CDATA[HQ_MUSIC_Url]]></HQMusicUrl>
<ThumbMediaId><![CDATA[media_id]]></ThumbMediaId>
</Music>
 * @author {康培亮/AB052634}
 */

public class Music implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@XStreamAlias(value = "Title")
	private String title;
	
	@XStreamAlias(value = "Description")
	private String description;
	
	@XStreamAlias(value = "MusicUrl")
	private String musicUrl;
	
	@XStreamAlias(value = "HQMusicUrl")
	private String hqMusicUrl;
	
	@XStreamAlias(value = "ThumbMediaId")
	private String thumbMediaId;
	
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

	public String getMusicUrl() {
		return musicUrl;
	}

	public void setMusicUrl(String musicUrl) {
		this.musicUrl = musicUrl;
	}

	public String getHqMusicUrl() {
		return hqMusicUrl;
	}

	public void setHqMusicUrl(String hqMusicUrl) {
		this.hqMusicUrl = hqMusicUrl;
	}

	public String getThumbMediaId() {
		return thumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}
}
