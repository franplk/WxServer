package cn.plk.server.vo;

import java.io.Serializable;

import cn.plk.exception.DataAccessException;

/**
 * @author {康培亮/AB052634}
 *
 */
public class WebData implements Serializable {

	private static final long serialVersionUID = 1L;

	private String errorCode;
	private String errorDesc;
	private Object data;

	public WebData () {}
	
	public WebData (DataAccessException e) {
		setErrorCode(e.getCode());
		setErrorDesc(e.getDesc());
	}
	
	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return errorDesc;
	}

	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
