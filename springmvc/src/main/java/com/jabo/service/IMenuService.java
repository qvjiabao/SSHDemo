package com.jabo.service;

import com.jabo.pojo.MenuModel;
import com.jabo.pojo.UserModel;
import com.jabo.vo.MenuVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface IMenuService {

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
     * 删除菜单
     *
     * @param menuId
     * @return
     */
    boolean delMenu(int menuId);

    /**
     * 根据编码获取子集菜单
     *
     * @param menuCode 菜单编码
     * @return
     */
    List<MenuVO> queryMenuByPCode(String menuCode);

    /**
     * 根据编码获取菜单
     *
     * @param menuCode 菜单编码
     * @return
     */
    MenuVO queryMenuByCode(String menuCode);

    /**
     * 保存菜单信息
     *
     * @param model 菜单编码
     * @return
     */
    boolean saveMenu(MenuModel model);
}
