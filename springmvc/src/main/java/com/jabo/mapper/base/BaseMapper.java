package com.jabo.mapper.base;

import com.jabo.pojo.base.BaseModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BaseMapper<T extends BaseModel> {

    int addModel(T t);

    int deletedModelById(Map<String, Object> map);

    int updateModel(T t);


}
