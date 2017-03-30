/**
 * 
 */
package cn.plk.client;

import cn.plk.util.HttpClientUtil;

/**
 * @author {康培亮/AB052634}
 *
 */
public class WxClient {

	private static final String url = "http://127.0.0.1/wx";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HttpClientUtil httpClient = HttpClientUtil.getInstance();
		
		String xmlMsg = "<xml><ToUserName><![CDATA[toUser]]></ToUserName><FromUserName><![CDATA[fromUser]]>"
				+ "</FromUserName><CreateTime>1351776360</CreateTime><MsgType><![CDATA[location]]></MsgType>"
				+ "<Location_X>23.134521</Location_X><Location_Y>113.358803</Location_Y><Scale>20</Scale>"
				+ "<Label><![CDATA[位置信息]]></Label><MsgId>1234567890123456</MsgId></xml>";
		
		String msg = httpClient.sendHttpPost(url, xmlMsg, "application/xml");
		
		System.out.println("msg = ");
		System.out.println(msg);
		
	}

}
