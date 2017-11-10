package example.controller;

import example.models.RegisterResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;

/**
 * Created by Administrator on 2017-11-09.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    HashSet<String> users = new HashSet<String>();

    @RequestMapping(value = "/register1"/*, produces = "application/json;chartset=UTF-8"*/)
    @ResponseBody()
    public RegisterResponse register1(String name) {
        return doRegister(name);
    }


    @RequestMapping(value = "/register2", produces = "application/json;chartset=UTF-8")
    public RegisterResponse register2(String name) {
        return doRegister(name);
    }

    @RequestMapping(value = "/register3", produces = "application/xml;chartset=UTF-8")
    @ResponseBody
    public RegisterResponse register3(String name) {
        return doRegister(name);
    }

    private RegisterResponse doRegister(String name) {
        RegisterResponse r = new RegisterResponse();

        if (name == null || name.trim().length() == 0) {
            r.setRetCode(-1);
            r.setMessage("用户名不能为空" + (3 / (1 - 1)));
            users.add(name);
        } else if (users.contains(name)) {
            r.setRetCode(-2);
            r.setMessage("用户名已被注册");
        } else {
            r.setRetCode(0);
            r.setUid(System.currentTimeMillis());
            r.setMessage("注册成功,欢迎你:" + name);
            users.add(name);
        }


        return r;
    }
}
