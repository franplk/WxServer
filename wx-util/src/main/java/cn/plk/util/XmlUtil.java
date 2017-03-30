/**
 * 
 */
package cn.plk.util;

import java.io.InputStream;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/**
 * @author {康培亮/AB052634}
 *
 */
public class XmlUtil {

	private XmlUtil() {
	}

	public static Map<String, String> parser(InputStream inputStream) {

		Map<String, String> xmlMap = new HashMap<String, String>();
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document document = db.parse(inputStream);

			Element root = document.getDocumentElement();
			NodeList nodes = root.getChildNodes();
			int len = nodes.getLength();
			for (int i = 0; i < len; i++) {
				Node node = nodes.item(i);
				xmlMap.put(node.getNodeName(), node.getTextContent());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return xmlMap;
	}
	
	public static Map<String, String> parser(String xmlStr) {

		Map<String, String> xmlMap = new HashMap<String, String>();
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			InputSource is = new InputSource(new StringReader(xmlStr));
			Document document = db.parse(is);

			Element root = document.getDocumentElement();
			NodeList nodes = root.getChildNodes();
			int len = nodes.getLength();
			for (int i = 0; i < len; i++) {
				Node node = nodes.item(i);
				xmlMap.put(node.getNodeName(), node.getTextContent());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return xmlMap;
	}
	
	public static void main (String[] args) {
		String xmlMsg = "<xml><ToUserName><![CDATA[toUser]]></ToUserName><FromUserName><![CDATA[fromUser]]>"
				+ "</FromUserName><CreateTime>1351776360</CreateTime><MsgType><![CDATA[location]]></MsgType>"
				+ "<Location_X>23.134521</Location_X><Location_Y>113.358803</Location_Y><Scale>20</Scale>"
				+ "<Label><![CDATA[位置信息]]></Label><MsgId>1234567890123456</MsgId></xml>";
		Map<String, String> map = XmlUtil.parser(xmlMsg);
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}
