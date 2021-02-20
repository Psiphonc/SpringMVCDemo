package top.psiphonc.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// 只要实现Controller 就是一个控制器
public class Controller1 implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("msg", "Controller1");
        modelAndView.setViewName("test");
        return modelAndView;
    }
}
