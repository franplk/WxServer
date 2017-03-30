/**
 * 创建日期 : 2017年1月10日
 * 修改历史 : 
 *     1. [2017年1月10日]创建文件 by {康培亮/AB052634}
 */
package cn.plk.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 权限拦截器，完成权限验证
 * @author {康培亮/AB052634}
 */
public class AuthIntercept implements HandlerInterceptor {
    
    private boolean verify;
    
    /**
     * @see HandlerInterceptor#preHandle(HttpServletRequest, HttpServletResponse, Object)
     **/
    @Override
    public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object obj) throws Exception {
        if (verify) {
            return false;
        }
        return true;
    }
    
    /**
     * @see HandlerInterceptor#postHandle(HttpServletRequest, HttpServletResponse, Object, ModelAndView)
     **/
    @Override
    public void postHandle(HttpServletRequest req, HttpServletResponse res, Object obj, ModelAndView view) throws Exception {
        if (null != view) {
            view.addObject("isVerify", "1");
        }
    }

    /**
     * @see HandlerInterceptor#afterCompletion(HttpServletRequest, HttpServletResponse, Object, Exception)
     **/
    @Override
    public void afterCompletion(HttpServletRequest req, HttpServletResponse res, Object obj, Exception e) throws Exception {
        
    }

    public boolean isVerify() {
        return verify;
    }

    public void setVerify(boolean verify) {
        this.verify = verify;
    }
}
