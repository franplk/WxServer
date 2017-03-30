/**
 * 
 */
package cn.plk.server;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.plk.exception.DataAccessException;
import cn.plk.exception.ViewAccessException;
import cn.plk.server.vo.WebData;

/**
 * @author {康培亮/AB052634}
 *
 */
@ControllerAdvice
public class WxControllerAdvice {

	@InitBinder
	public void initDataBinder() {
		System.out.println("应用到所有@RequestMapping注解方法，在其执行之前初始化数据绑定器");
	}

	@ModelAttribute
	public void initModel(ModelMap model) {
		model.addAttribute("Date", "");
		System.out.println("应用到所有@RequestMapping注解方法，在其执行之前把返回值放入Model");
	}

	/**
	 * 处理访问接口时的异常
	 */
	@ExceptionHandler(DataAccessException.class)
	@ResponseBody
	public WebData processInterfaceException(DataAccessException e) {
		WebData webData = new WebData(e);
		webData.setData(e.getData());
		return webData;
	}

	/**
	 * 处理访问视图时的异常
	 */
	@ExceptionHandler(ViewAccessException.class)
	public ModelAndView processViewException(ModelMap modelMap, ViewAccessException e) {
		modelMap.put("errorMsg", e.getMessage());
		return new ModelAndView("viewName", modelMap);
	}
}
