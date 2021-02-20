package top.psiphonc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(Model model) {
        // 往model中存数据
        model.addAttribute("msg", "Hello, Spring MVC!");
        //会被视图解析器处理
        return "hello";
    }
}
