package com.jabo.service;

import com.jabo.pojo.UserModel;
import com.jabo.vo.UserVO;

import java.util.List;
import java.util.Map;

public interface IUserService {

    /**
     * 新增用户
     *
     * @param user
     * @return
     */
    boolean saveUser(UserModel user);

    /**
     * 根据Id删除用户
     *
     * @param arrayUserId
     * @return
     */
    boolean deleteUserById(List<Integer> arrayUserId);

    /**
     * 根据Id查询用户
     *
     * @param id
     * @return
     */
    UserVO queryUserById(int id);

    /**
     * 查询所有用户
     *
     * @param userName
     * @param cnName
     * @param phoneNumber
     * @param email
     * @param sex
     * @return
     */
    List<UserVO> queryAllUser(String userName, String cnName, String phoneNumber
            , String email, String sex);

    /**
     * 查询所有用户分页
     *
     * @param page
     * @param limit
     * @param userName
     * @param cnName
     * @param phoneNumber
     * @param email
     * @param sex
     * @return
     */
    List<UserVO> queryAllModelPage(int page, int limit, String userName
            , String cnName, String phoneNumber, String email, String sex);
}
