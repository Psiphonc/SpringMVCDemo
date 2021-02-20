package top.psiphonc.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;


@RestController
public class FileController {
    @PostMapping("/upload")
    public String upload(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) throws IOException {
        //设置文件保存路径
        String path = request.getSession().getServletContext().getRealPath("/upload");
        System.out.println("path:" + path);
        File realPath = new File(path);
        if (!realPath.exists()) {
            realPath.mkdir();
            realPath.mkdir();
        }
        System.out.println("上传的文件地址：" + realPath);
        //CommonsMultipartFile的方法写文件，简化
        file.transferTo(new File(realPath + "/" + file.getOriginalFilename()));
        return "redirect:/index.jsp";
    }
}
