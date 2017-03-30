/**
 * 
 */
package cn.plk.cdata;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * @author {康培亮/AB052634}
 *
 */
public class CdataAdapter extends XmlAdapter<String, String> {

	@Override
	public String unmarshal(String str) throws Exception {
		return str;
	}

	@Override
	public String marshal(String str) throws Exception {
		return "<![CDATA[" + str+ "]]>";
	}

}
