/**
 * 
 */
package cn.plk.menu;

import java.io.Serializable;
import java.util.List;

/**
 * @author {康培亮/AB052634}
 *
 */
public class MenuGroup implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Menu> button;

	public List<Menu> getButton() {
		return button;
	}

	public void setButton(List<Menu> button) {
		this.button = button;
	}
}
