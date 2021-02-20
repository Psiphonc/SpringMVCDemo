package top.psiphonc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        final ModelAndView modelAndView = new ModelAndView();
        // 执行service后获得返回结果
        String ret = "HelloSpringMVC";
        // 存进model
        modelAndView.addObject("msg",ret);
        // 设置要跳转的view名
        modelAndView.setViewName("test");

        return modelAndView;
    }
}
