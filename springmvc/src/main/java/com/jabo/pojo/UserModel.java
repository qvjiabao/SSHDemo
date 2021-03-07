package com.jabo.pojo;

import com.jabo.pojo.base.BaseModel;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class UserModel extends BaseModel {

    /**
     * 用户ID
     */
    private int userId;
    /**
     * 用户编码
     */
    private String userCode;
    /**
     * 用户账号
     */
    private String userName;
    /**
     * 用户密码
     */
    private String userPwd;
    /**
     * 中文姓名
     */
    private String cnName;
    /**
     * 身份证号
     */
    private String idCard;
    /**
     * 性别
     */
    private String sex;
    /**
     * 职位
     */
    private String position;
    /**
     * 手机号
     */
    private String phoneNumber;
    /**
     * 联系电话
     */
    private String contactNumber;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 所属区域
     */
    private String userArea;
    /**
     * 工作地点
     */
    private String workingPlace;
    /**
     * 家庭地址
     */
    private String homeAddress;
    /**
     * 入职时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date entryTime;
    /**
     * 出生日期
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

}
