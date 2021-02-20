package top.psiphonc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller2 {

    @RequestMapping("/t2")
    public String controllerTest2(Model model) {
        model.addAttribute("msg", "Controller2");
        return "test";
    }
}
