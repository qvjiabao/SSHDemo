package com.jabo.service.impl;

import com.jabo.mapper.MenuMapper;
import com.jabo.service.IMenuService;
import com.jabo.vo.MenuVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class MenuServiceImpl implements IMenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<MenuVO> getMenuTree() {
        return menuMapper.getMenuTree();
    }

    @Override
    public List<MenuVO> getMenuList() {
        return menuMapper.getMenuList();
    }

    @Override
    public boolean delMenu(int menuId) {

        HashMap<String, Object> map = new HashMap<>();
        map.put("menuId", menuId);
        map.put("updateData", new Date());
        map.put("updateUserName", "qujb8078");
        map.put("updateCnName", "曲佳宝");

        return menuMapper.delMenu(map);
    }
}
