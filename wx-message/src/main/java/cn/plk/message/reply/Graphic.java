/**
 * 
 */
package cn.plk.message.reply;

import java.io.Serializable;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * <item>
 * <Title><![CDATA[title1]]></Title>
 * <Description><![CDATA[description1]]></Description>
 * <PicUrl><![CDATA[picurl]]></PicUrl>
 * <Url><![CDATA[url]]></Url>
 * </item>
 * 
 * @author {康培亮/AB052634}
 */

@XStreamAlias(value = "item")
public class Graphic implements Serializable {

	private static final long serialVersionUID = 1L;

	@XStreamAlias(value = "Title")
	private String title;
	
	@XStreamAlias(value = "Description")
	private String description;
	
	@XStreamAlias(value = "PicUrl")
	private String picUrl;
	
	@XStreamAlias(value = "Url")
	private String url;

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

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
