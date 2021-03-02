package com.jabo.controller;

import com.alibaba.fastjson.JSON;
import com.jabo.controller.core.R;
import com.jabo.pojo.UserModel;
import com.jabo.service.IUserService;
import com.jabo.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    //真实访问地址 : 项目名/HelloController/hello
    @GetMapping("/userlist")
    public R<Map<String, Object>> userlist(@RequestParam int page, @RequestParam int limit, @RequestParam(required = false) String userName
            , @RequestParam(required = false) String cnName, @RequestParam(required = false) String phoneNumber
            , @RequestParam(required = false) String email, @RequestParam(required = false) String sex) {

        List<UserVO> userVOS = userService.queryAllModelPage(page, limit, userName, cnName, phoneNumber, email, sex);
        HashMap hashMap = new HashMap<String, Object>();
        hashMap.put("data", userVOS);
        hashMap.put("count", userService.queryAllUser(userName, cnName, phoneNumber, email, sex).size());

        return R.data(hashMap);
    }
}