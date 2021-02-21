package com.jabo.mapper;

import com.jabo.mapper.base.BaseMapper;
import com.jabo.pojo.MenuModel;
import com.jabo.vo.MenuVO;

import java.util.List;

public interface MenuMapper extends BaseMapper<MenuModel> {

    List<MenuVO> getMenuTree();
}
