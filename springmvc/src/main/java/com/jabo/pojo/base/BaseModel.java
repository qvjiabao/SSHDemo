package com.jabo.pojo.base;

import lombok.Data;

import java.util.Date;

@Data
public class BaseModel {

    /**
     * 是否启用
     */
    private Boolean isEnable;
    /**
     * 是否删除
     */
    private Boolean isDelete;
    /**
     * 创建人姓名
     */
    private String createCnName;
    /**
     * 创建人账号
     */
    private String createUserName;
    /**
     * 创建时间
     */
    private Date createDate;
    /**
     * 编辑人账号
     */
    private String updateUserName;
    /**
     * 编辑人姓名
     */
    private String updateCnName;
    /**
     * 编辑时间
     */
    private Date updateDate;
}
