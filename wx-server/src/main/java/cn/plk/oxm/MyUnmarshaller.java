/**
 * 
 */
package cn.plk.oxm;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Source;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamSource;

import org.springframework.oxm.Unmarshaller;
import org.springframework.oxm.XmlMappingException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/**
 * @author {康培亮/AB052634}
 *
 */
public class MyUnmarshaller implements Unmarshaller {

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}

	@Override
	public Object unmarshal(Source source) throws IOException, XmlMappingException {
		InputSource is = null;
		if (source instanceof StreamSource) {
			is = new InputSource (((StreamSource) source).getInputStream());
		} else if (source instanceof SAXSource) {
			is = ((SAXSource) source).getInputSource();
		}
		
		Map<String, String> xmlMap = null;
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document document = db.parse(is);
			
			Element root = document.getDocumentElement();
			NodeList nodes = root.getChildNodes();
			xmlMap = getXmlMap(nodes);
		} catch (Exception e) {
			e.printStackTrace();
			xmlMap = Collections.emptyMap();
		}
		
		return xmlMap;
	}
	
	private Map<String, String> getXmlMap (NodeList nodes) {
		Map<String, String> xmlMap = new HashMap<String, String>();
		int len = nodes.getLength();
		for (int i = 0; i < len; i++) {
			Node node = nodes.item(i);node.getChildNodes();
			xmlMap.put(node.getNodeName(), node.getTextContent());
		}
		return xmlMap;
	}
}
