package com.jabo.controller;

import com.alibaba.fastjson.JSON;
import com.jabo.pojo.UserModel;
import com.jabo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/HelloController")
public class HelloController {

    @Autowired
    IUserService userService;

    //真实访问地址 : 项目名/HelloController/hello
    @RequestMapping("/hello")
    public String sayHello(Model model) {

        UserModel userModel = userService.queryUserById(33);

        String jsonOutput = JSON.toJSONString(userModel);

        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg", jsonOutput);
        //web-inf/jsp/hello.jsp
        return "hello";
    }
}