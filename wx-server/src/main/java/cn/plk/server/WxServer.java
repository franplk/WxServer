package cn.plk.server;

import java.io.InputStream;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.plk.exception.WxException;
import cn.plk.message.ReplyMsg;
import cn.plk.server.vo.VerifyBean;

/**
 * 公众号接入微信的验证，与提供服务。
 * 
 * @author {康培亮/AB052634}
 */
@Controller
@RequestMapping(value = "/wx")
public class WxServer {

	@Autowired
	private WxManager wxManager;

	/**
	 * 用于微信公众号的接入验证
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET, produces = "text/plain")
	public String verify(VerifyBean vb) {
		if (wxManager.checkSignature(vb)) {
			return vb.getEchostr();
		}
		return null;
	}

	/**
	 * 用于微信公众号消息的接收与回复
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, produces = "application/xml")
	public ReplyMsg msgDeploy(HttpServletRequest request) {
		try {
			InputStream inputStream = request.getInputStream();
			return wxManager.getReplyMsg(inputStream);
		} catch (WxException we) {
			throw we;
		} catch (Exception e) {
			throw new WxException(e.getMessage());
		}
	}
	
	/**
	 * 用于微信公众号消息的接收与回复
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST, produces = "application/json")
	public ReplyMsg service(@RequestBody Map<String, String> xmlMap) {
		try {
			return wxManager.getReplyMsg(xmlMap);
		} catch (WxException we) {
			throw we;
		}
	}
}
