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
<MsgType><![CDATA[music]]></MsgType>
<Music>
<Title><![CDATA[TITLE]]></Title>
<Description><![CDATA[DESCRIPTION]]></Description>
<MusicUrl><![CDATA[MUSIC_Url]]></MusicUrl>
<HQMusicUrl><![CDATA[HQ_MUSIC_Url]]></HQMusicUrl>
<ThumbMediaId><![CDATA[media_id]]></ThumbMediaId>
</Music>
</xml>
 * @author {康培亮/AB052634}
 */

@XStreamAlias(value = "xml")
public class MusicMsg extends ReplyMsg {

	private static final long serialVersionUID = 1L;
	
	@XStreamAlias(value = "Music")
	private Music music;

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}
}
