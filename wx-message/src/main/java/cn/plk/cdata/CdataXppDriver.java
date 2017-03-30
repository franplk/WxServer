/**
 * 
 */
package cn.plk.cdata;

import java.io.Writer;

import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;

/**
 * @author {康培亮/AB052634}
 *
 */
public class CdataXppDriver extends XppDriver {

	protected static String PREFIX_CDATA = "<![CDATA[";
	protected static String SUFFIX_CDATA = "]]>";

	@Override
	public HierarchicalStreamWriter createWriter(Writer out) {
		return new PrettyPrintWriter(out) {
			// 对所有String类型节点的转换都增加CDATA标记
			boolean cdata = false;

			@SuppressWarnings("rawtypes")
			public void startNode(String name, Class clazz) {
				super.startNode(name, clazz);
				if (String.class.equals(clazz)) {
					cdata = true;
				} else {
					cdata = false;
				}
			}

			@Override
			protected void writeText(QuickWriter writer, String text) {
				if (cdata) {
					writer.write(PREFIX_CDATA);
					writer.write(text);
					writer.write(SUFFIX_CDATA);
				} else {
					writer.write(text);
				}
			}
		};
	}
}
