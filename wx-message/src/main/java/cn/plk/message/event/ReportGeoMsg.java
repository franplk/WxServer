/**
 * 
 */
package cn.plk.message.event;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import cn.plk.message.EventMsg;

/**
 * 上报地理位置信息 <xml> <ToUserName><![CDATA[toUser]]></ToUserName>
 * <FromUserName><![CDATA[fromUser]]></FromUserName>
 * <CreateTime>123456789</CreateTime> <MsgType><![CDATA[event]]></MsgType>
 * <Event><![CDATA[LOCATION]]></Event> <Latitude>23.137466</Latitude>
 * <Longitude>113.352425</Longitude> <Precision>119.385040</Precision> </xml>
 * 
 * @author {康培亮/AB052634}
 */

@XmlRootElement(name = "xml")
public class ReportGeoMsg extends EventMsg {

	private static final long serialVersionUID = 1L;

	private float latitude;
	private float longitude;
	private float precision;

	public float getLatitude() {
		return latitude;
	}

	@XmlElement(name="Latitude")
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	@XmlElement(name="Longitude")
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public float getPrecision() {
		return precision;
	}

	@XmlElement(name="Precision")
	public void setPrecision(float precision) {
		this.precision = precision;
	}
	
	@Override
	public String toString () {
		return new StringBuffer()
				.append(super.toString())
				.append("Latitude=").append(latitude)
				.append("Longitude=").append(longitude).append(";")
				.append("Precision=").append(precision).append(";")
				.toString();
	}
}
