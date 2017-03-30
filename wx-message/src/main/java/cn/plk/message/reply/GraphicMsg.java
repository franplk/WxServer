/**
 * 
 */
package cn.plk.message.reply;

import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import cn.plk.message.ReplyMsg;

/**
 * <xml> 
 * <ToUserName><![CDATA[toUser]]></ToUserName>
 * <FromUserName><![CDATA[fromUser]]></FromUserName>
 * <CreateTime>12345678</CreateTime> 
 * <MsgType><![CDATA[news]]></MsgType>
 * <ArticleCount>1</ArticleCount> 
 * <Articles> 
 *   <item>
 *     <Title><![CDATA[title1]]></Title>
 *     <Description><![CDATA[description1]]></Description>
 *     <PicUrl><![CDATA[picurl]]></PicUrl> 
 *     <Url><![CDATA[url]]></Url> 
 *   </item>
 * </Articles> 
 * </xml>
 * 
 * @author {康培亮/AB052634}
 */

@XStreamAlias(value = "xml")
public class GraphicMsg extends ReplyMsg {

	private static final long serialVersionUID = 1L;

	@XStreamAlias(value = "ArticleCount")
	private int articleCount;
	
	@XStreamAlias(value = "Articles")
	private List<Graphic> articles;

	public int getArticleCount() {
		return articleCount;
	}

	public void setArticleCount(int articleCount) {
		this.articleCount = articleCount;
	}

	public List<Graphic> getArticles() {
		return articles;
	}

	public void setArticles(List<Graphic> articles) {
		this.articles = articles;
	}
}
