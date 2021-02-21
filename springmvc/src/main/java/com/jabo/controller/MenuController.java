package com.jabo.controller;

import com.jabo.controller.core.R;
import com.jabo.service.IMenuService;
import com.jabo.service.IUserService;
import com.jabo.vo.MenuVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    IMenuService menuService;

    @GetMapping("/list")
    public R<List<MenuVO>> list() {

        List<MenuVO> menuTree = menuService.getMenuTree();
        return R.data(menuTree);
    }
}