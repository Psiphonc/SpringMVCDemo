package top.psiphonc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 跳过视图解析
public class RestfulController {
    @GetMapping(value = "/test", produces = "application/json;charset=utf-8")
    public String test() {
        System.out.println("TestController:test");
        return "OK";
    }
}
