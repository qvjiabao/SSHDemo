package com.jabo.mapper;

import com.jabo.mapper.base.BaseMapper;
import com.jabo.pojo.MenuModel;
import com.jabo.vo.MenuVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MenuMapper extends BaseMapper<MenuModel> {

    /**
     * 获取菜单树
     *
     * @return
     */
    List<MenuVO> getMenuTree();

    /**
     * 获取菜单列表(平级)
     *
     * @return
     */
    List<MenuVO> getMenuList();

    /**
     * 根据编码获取子集菜单
     *
     * @param menuCode 菜单编码
     * @return
     */
    List<MenuVO> queryMenuByPCode(@Param("menu_code") String menuCode);

    /**
     * 删除菜单
     *
     * @param map
     * @return
     */
    boolean delMenu(Map<String, Object> map);
}
