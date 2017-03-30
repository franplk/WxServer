package cn.plk.exception;

/**
 * @author {康培亮/AB052634}
 *
 */
public class DataAccessException extends BussinessException {

	private static final long serialVersionUID = 1L;
	
	private Object data;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	} 
}
