package com.jabo.service.impl;

import com.jabo.mapper.UsersMapper;
import com.jabo.pojo.UserModel;
import com.jabo.service.IUserService;
import com.jabo.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public boolean saveUser(UserModel user) {

        if (user.getUserId() == 0) {
            user.setUserCode(UUID.randomUUID().toString().toUpperCase().replaceAll("-", ""));
            user.setCreateDate(new Date());
            user.setIsDelete(false);
            user.setIsEnable(true);
            user.setCreateCnName("曲佳宝");
            user.setCreateUserName("qujb8078");
            return usersMapper.addModel(user) > 0;
        } else {
            user.setUpdateDate(new Date());
            user.setUpdateCnName("曲佳宝");
            user.setUpdateUserName("qujb8078");
            return usersMapper.updateModel(user) > 0;
        }
    }

    @Override
    public boolean deleteUserById(List<Integer> arrayUserId) {
        boolean success = true;
        try {
            for (Integer item : arrayUserId) {
                Map<String, Object> map = new HashMap<>();
                map.put("id", item);
                map.put("updateData", new Date());
                map.put("updateUserName", "qujb8078");
                map.put("updateCnName", "曲佳宝");
                usersMapper.deletedModelById(map);
            }
        } catch (Exception e) {
            success = false;
        }
        return success;
    }

    @Override
    public UserVO queryUserById(int id) {
        return usersMapper.queryModelById(id);
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
