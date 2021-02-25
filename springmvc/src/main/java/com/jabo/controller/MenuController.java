package com.jabo.controller;

import com.jabo.controller.core.R;
import com.jabo.pojo.MenuModel;
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

    @GetMapping("/getMenu/{menuCode}")
    public R<MenuVO> userMenu(@PathVariable("menuCode") String menuCode) {

        MenuVO menuVO = menuService.queryMenuByCode(menuCode);
        return R.data(menuVO);
    }

    @GetMapping("/list")
    public R<List<MenuVO>> list() {

        List<MenuVO> menuTree = menuService.getMenuList();
        return R.data(menuTree);
    }

    @PostMapping("/delMenu")
    public R delMenu(int menuId, String menuCode) {

        List<MenuVO> menuVOS = menuService.queryMenuByPCode(menuCode);
        if (menuVOS.size() > 0) {
            return R.fail("当前菜单存在子集，删除失败！");
        }
        boolean success = menuService.delMenu(menuId);
        return R.data(success);
    }

    @PostMapping("/saveMenu")
    public R saveMenu(MenuModel model) {
        boolean success = menuService.saveMenu(model);
        return success ? R.data(true) : R.fail("操作失败！");
    }
}