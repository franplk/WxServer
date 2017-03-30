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
 * 地理位置信息消息 <xml> <Location_X>23.134521</Location_X>
 * <Location_Y>113.358803</Location_Y> <Scale>20</Scale>
 * <Label><![CDATA[位置信息]]></Label> </xml>
 * 
 * @author {康培亮/AB052634}
 */

@XmlRootElement(name = "xml")
public class GeoMsg extends RecvMsg {

	private static final long serialVersionUID = 1L;

	private Integer scale;
	private String label;
	private double location_x;
	private double location_y;

	public double getLocation_x() {
		return location_x;
	}

	@XmlElement(name = "Location_X")
	public void setLocation_x(double location_x) {
		this.location_x = location_x;
	}

	public double getLocation_y() {
		return location_y;
	}

	@XmlElement(name = "Location_Y")
	public void setLocation_y(double location_y) {
		this.location_y = location_y;
	}

	public Integer getScale() {
		return scale;
	}

	@XmlElement(name = "Scale")
	public void setScale(Integer scale) {
		this.scale = scale;
	}

	public String getLabel() {
		return label;
	}

	@XmlElement(name = "Label")
	@XmlJavaTypeAdapter(CdataAdapter.class)
	public void setLabel(String label) {
		this.label = label;
	}
}
