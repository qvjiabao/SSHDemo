package com.jabo.service.impl;

import com.jabo.mapper.MenuMapper;
import com.jabo.pojo.MenuModel;
import com.jabo.service.IMenuService;
import com.jabo.vo.MenuVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

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

    @Override
    public List<MenuVO> queryMenuByPCode(String menuCode) {
        return menuMapper.queryMenuByPCode(menuCode);
    }

    @Override
    public MenuVO queryMenuByCode(String menuCode) {

        return menuMapper.queryMenuByCode(menuCode);
    }

    @Override
    @Transactional
    public boolean saveMenu(MenuModel model) {
        boolean result;
        if (model.getMenuId() == 0) {
            if (model.getParentCode() == null || "".equals(model.getParentCode())) {
                model.setParentCode("0");
            }
            model.setMenuCode(UUID.randomUUID().toString().toUpperCase().replaceAll("-", ""));
            model.setCreateDate(new Date());
            model.setIsDelete(false);
            model.setIsEnable(true);
            model.setCreateCnName("曲佳宝");
            model.setCreateUserName("qujb8078");
            result = menuMapper.addModel(model) > 0;
        } else {
            model.setUpdateDate(new Date());
            model.setUpdateCnName("曲佳宝");
            model.setUpdateUserName("qujb8078");
            result = menuMapper.updateModel(model) > 0;
        }
        return result;
    }
}
