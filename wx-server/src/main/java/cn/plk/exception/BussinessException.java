package cn.plk.exception;

/**
 * 异常信息封装
 * @author {康培亮/AB052634}
 */
public abstract class BussinessException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	protected String code;
	protected String desc;

	protected BussinessException() {
	}
	
	protected BussinessException(String desc) {
		this("9999", desc);
	}
	
	protected BussinessException(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
