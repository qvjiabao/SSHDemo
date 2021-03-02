package com.jabo.service.impl;

import com.jabo.mapper.UsersMapper;
import com.jabo.pojo.UserModel;
import com.jabo.service.IUserService;
import com.jabo.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public int addBook(UserModel user) {
        return 0;
    }

    @Override
    public int deleteUserById(int id) {
        return 0;
    }

    @Override
    public int updateBook(UserModel user) {
        return 0;
    }

    @Override
    public UserVO queryUserById(int id) {
        return null;
        //UserVO userModel = usersMapper.queryModelById(id);
        //return userModel;
    }

    @Override
    public List<UserVO> queryAllUser(String userName, String cnName, String phoneNumber, String email, String sex) {

        Map<String, Object> map = new HashMap<String, Object>();
        if (userName != null && !"".equals(userName))
            map.put("userName", "%" + userName + "%");
        if (cnName != null && !"".equals(cnName))
            map.put("cnName", "%" + cnName + "%");
        if (phoneNumber != null && !"".equals(phoneNumber))
            map.put("phoneNumber", "%" + phoneNumber + "%");
        if (email != null && !"".equals(email))
            map.put("email", "%" + email + "%");
        if (sex != null && !"".equals(sex))
            map.put("sex", sex);
        List<UserVO> list = usersMapper.queryAllModel(map);
        return list;
    }

    @Override
    public List<UserVO> queryAllModelPage(int page, int limit, String userName
            , String cnName, String phoneNumber, String email, String sex) {

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("page", limit * (page - 1));
        map.put("limit", limit * page);
        if (userName != null && !"".equals(userName))
            map.put("userName", "%" + userName + "%");
        if (cnName != null && !"".equals(cnName))
            map.put("cnName", "%" + cnName + "%");
        if (phoneNumber != null && !"".equals(phoneNumber))
            map.put("phoneNumber", "%" + phoneNumber + "%");
        if (email != null && !"".equals(email))
            map.put("email", "%" + email + "%");
        if (sex != null && !"".equals(sex))
            map.put("sex", sex);
        return usersMapper.queryAllModelPage(map);
    }
}
