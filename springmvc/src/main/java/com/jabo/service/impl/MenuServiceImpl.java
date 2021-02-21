package com.jabo.service.impl;

import com.jabo.mapper.MenuMapper;
import com.jabo.service.IMenuService;
import com.jabo.vo.MenuVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements IMenuService {

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<MenuVO> getMenuTree() {
        return menuMapper.getMenuTree();
    }
}
