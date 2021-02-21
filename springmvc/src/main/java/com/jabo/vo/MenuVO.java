package com.jabo.vo;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class MenuVO  {

    /**
     * 菜单ID
     */
    @JSONField(name = "name")
    private int menuId;
    /**
     * 菜单名称
     */
    @JSONField(name = "title")
    private String menuName;

    /**
     * 菜单地址
     */
    @JSONField(name = "jump")
    private String url;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * 子菜单
     */
    @JSONField(name = "list")
    private List<MenuVO> children;
}
