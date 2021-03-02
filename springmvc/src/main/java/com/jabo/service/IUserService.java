package com.jabo.service;

import com.jabo.pojo.UserModel;
import com.jabo.vo.UserVO;

import java.util.List;
import java.util.Map;

public interface IUserService {

    //增加一个Book
    int addBook(UserModel user);

    //根据id删除一个Book
    int deleteUserById(int id);

    //更新Book
    int updateBook(UserModel user);

    //根据id查询,返回一个Book
    UserVO queryUserById(int id);

    //查询全部Book,返回list集合
    List<UserVO> queryAllUser(String userName, String cnName, String phoneNumber
            , String email, String sex);

    List<UserVO> queryAllModelPage(int page, int limit, String userName
            , String cnName, String phoneNumber, String email, String sex);
}
