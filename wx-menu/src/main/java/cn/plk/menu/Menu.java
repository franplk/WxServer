/**
 * 
 */
package cn.plk.menu;

import java.io.Serializable;
import java.util.List;

/**
 * 微信端菜单
 * @author {康培亮/AB052634}
 */
public class Menu implements Serializable {

	private static final long serialVersionUID = 1L;

	private String type;
	private String name;
	private List<Menu> sub_button;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Menu> getSub_button() {
		return sub_button;
	}

	public void setSub_button(List<Menu> sub_button) {
		this.sub_button = sub_button;
	}
}
