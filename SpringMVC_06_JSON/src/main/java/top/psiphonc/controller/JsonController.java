package top.psiphonc.controller;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.psiphonc.pojo.User;

@Controller
//@RestController 直接跳过所有视图解析，作为纯restful接口使用
public class JsonController {
    //通过produces向响应头设置该响应内容为json utf-8
    @RequestMapping(value = "/jackson", produces = "application/json;charset=utf-8")
    //跳过视图解析，直接把返回结果响应出去
    @ResponseBody
    public String testJackson() throws JsonProcessingException {
        final User tom = new User("Tom", 19, "1234");
        final ObjectMapper objectMapper = new ObjectMapper();
        final JsonFactory jsonFactory = new JsonFactory();
        final String s = objectMapper.writeValueAsString(tom);
        return s;
    }
}
