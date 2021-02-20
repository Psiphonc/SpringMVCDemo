package top.psiphonc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestfulController {

    //@RequestMapping(path = "/add/{a}/{b}", method = RequestMethod.GET)
    @GetMapping("/add/{a}/{b}")
    String addGet(@PathVariable Integer a, @PathVariable Integer b, Model model) {
        int ret = a + b;
        model.addAttribute("result", ret);
        return "add";
    }
    @PostMapping("/add/{a}/{b}")
    String addPost(@PathVariable Integer a, @PathVariable Integer b, Model model) {
        int ret = a + b;
        model.addAttribute("result", ret);
        return "add";
    }
}
