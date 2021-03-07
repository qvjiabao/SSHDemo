package com.jabo.mapper;

import com.jabo.mapper.base.BaseMapper;
import com.jabo.pojo.UserModel;
import com.jabo.vo.UserVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UsersMapper extends BaseMapper<UserModel> {

    List<UserVO> queryAllModelPage(Map<String, Object> map);

    List<UserVO> queryAllModel(Map<String, Object> map);

    UserVO queryModelById(@Param("id") int id);
}
