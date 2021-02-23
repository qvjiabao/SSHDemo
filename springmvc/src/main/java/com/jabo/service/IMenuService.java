package com.jabo.service;

import com.jabo.vo.MenuVO;

import java.util.List;

public interface IMenuService {

    List<MenuVO> getMenuTree();

    List<MenuVO> getMenuList();

    boolean delMenu(int menuId);
}