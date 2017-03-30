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
 * 文本消息
 * <xml>
 * <Content><![CDATA[this is a test]]></Content>
 * </xml>
 * 
 * @author {康培亮/AB052634}
 *
 */
@XmlRootElement(name = "xml")
public class TextMsg extends RecvMsg {

	private static final long serialVersionUID = 1L;
	
	private String content;

	public TextMsg(){}
	
	@XmlElement(name="Content")
	@XmlJavaTypeAdapter(CdataAdapter.class)
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString () {
		return new StringBuffer()
				.append(super.toString())
				.append("content=").append(content)
				.toString();
	}
}
