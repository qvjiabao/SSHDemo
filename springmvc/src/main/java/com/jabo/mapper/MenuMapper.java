package com.jabo.mapper;

import com.jabo.mapper.base.BaseMapper;
import com.jabo.pojo.MenuModel;
import com.jabo.vo.MenuVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MenuMapper extends BaseMapper<MenuModel> {

    List<MenuVO> getMenuTree();

    List<MenuVO> getMenuList();

    boolean delMenu(Map<String, Object> map);
}
