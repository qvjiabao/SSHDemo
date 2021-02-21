package com.jabo.pojo;

import com.jabo.pojo.base.BaseModel;
import lombok.Data;

import java.util.Date;

@Data
public class UserModel extends BaseModel {

    /**
     * 用户ID
     */
    private int userId;
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
     * 英文名字
     */
    private String enName;
    /**
     * 用户代码
     */
    private String userCode;
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
    private Date entryTime;
    /**
     * 出生日期
     */
    private Date birthday;
    /**
     * 阴历或者阳历
     */
    private String birthdayType;
    /**
     * 配偶姓名
     */
    private String spouseName;
    /**
     * 配偶生日
     */
    private Date spouseBirthday;
    /**
     * 结婚日期
     */
    private Date weddingDate;
    /**
     * 子女姓名
     */
    private String childrenName;
    /**
     * 子女生日
     */
    private Date childrenBirthday;

}
