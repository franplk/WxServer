package cn.plk.exception;

/**
 * 微信异常
 * @author {康培亮/AB052634}
 */
public class WxException extends BussinessException {

	private static final long serialVersionUID = 1L;
	
	private Object data;
	
	public WxException() {
	}
	
	public WxException(String desc) {
		super(desc);
	}
	
	public WxException(String code, String desc) {
		super(code, desc);
	}
	
	public WxException(String code, String desc, Object data) {
		super(code, desc);
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
