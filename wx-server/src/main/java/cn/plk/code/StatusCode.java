/**
 * 
 */
package cn.plk.code;

/**
 * @author {康培亮/AB052634}
 *
 */
public enum StatusCode {

	SUCCESS("0", ""),
	FAILURE("-1", "");
	
	private String code;
	private String name;

	StatusCode () {}
	
	StatusCode (String code, String name) {
		this.code = code;
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
