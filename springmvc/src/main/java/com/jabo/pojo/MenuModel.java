package com.jabo.pojo;

import com.jabo.pojo.base.BaseModel;
import lombok.Data;

@Data
public class MenuModel extends BaseModel {

    /**
     * 菜单ID
     */
    private int menuId;
    /**
     * 菜单名称
     */
    private String menuName;
    /**
     * 菜单编码
     */
    private String menuCode;
    /**
     * 父编码
     */
    private String parentCode;
    /**
     * 菜单地址
     */
    private String url;
    /**
     * 菜单图标
     */
    private String icon;
    /**
     * 排序
     */
    private int sort;
}
