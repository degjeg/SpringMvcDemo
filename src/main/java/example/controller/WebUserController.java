package example.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2017-11-09.
 */
@Controller
@RequestMapping("/users")
public class WebUserController {


    @RequestMapping(value = "/register")
    public String register1() {
        return "/users/register";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public
    @ResponseBody
    String upload(MultipartFile file, String userName) {

        try {
            FileUtils.writeByteArrayToFile(new File(userName + ".头像.1jpg"), "你好".getBytes());
            FileUtils.writeByteArrayToFile(new File(userName + ".头像.jpg"), file.getBytes());
            return "ok" + userName;
        } catch (IOException e) {
            e.printStackTrace();
            return userName + e.getMessage();
        }
    }
}
