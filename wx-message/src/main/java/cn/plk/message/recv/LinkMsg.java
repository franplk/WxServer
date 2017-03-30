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
 * 链接消息
<xml>
<Title><![CDATA[公众平台官网链接]]></Title>
<Description><![CDATA[公众平台官网链接]]></Description>
<Url><![CDATA[url]]></Url>
</xml> 
 * @author {康培亮/AB052634}
 */

@XmlRootElement(name = "xml")
public class LinkMsg extends RecvMsg {

	private static final long serialVersionUID = 1L;
	
	private String title;
	private String description;
	private String url;

	public String getTitle() {
		return title;
	}

	@XmlElement(name = "Title")
	@XmlJavaTypeAdapter(CdataAdapter.class)
	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	@XmlElement(name = "Description")
	@XmlJavaTypeAdapter(CdataAdapter.class)
	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	@XmlElement(name = "Url")
	@XmlJavaTypeAdapter(CdataAdapter.class)
	public void setUrl(String url) {
		this.url = url;
	}

}
