package com.jabo.controller;

import com.jabo.controller.core.R;
import com.jabo.service.IMenuService;
import com.jabo.service.IUserService;
import com.jabo.vo.MenuVO;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    IMenuService menuService;

    @GetMapping("/userMenu")
    public R<List<MenuVO>> userMenu() {

        List<MenuVO> menuTree = menuService.getMenuTree();
        return R.data(menuTree);
    }

    @GetMapping("/list")
    public R<List<MenuVO>> list() {

        List<MenuVO> menuTree = menuService.getMenuList();
        return R.data(menuTree);
    }

    @PostMapping("/delMenu")
    public R delMenu(@Param("menuId") int menuId) {
        boolean success = menuService.delMenu(menuId);
        return R.data(success);
    }
}