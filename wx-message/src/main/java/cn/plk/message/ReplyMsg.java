/**
 * 
 */
package cn.plk.message;

/**
 * @author {康培亮/AB052634}
 *
 */
public class ReplyMsg extends WxMsg {

	private static final long serialVersionUID = 1L;
	
	public ReplyMsg () {
		setCreateTime(System.currentTimeMillis());
	}
	
	@Override
	public String toString () {
		return super.toString();
	}
}
