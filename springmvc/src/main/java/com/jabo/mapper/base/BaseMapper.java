package com.jabo.mapper.base;

import com.jabo.pojo.base.BaseModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BaseMapper<T extends BaseModel> {

    int addModel(T t);

    int deletedModelById(@Param("id") int id);

    int updateModel(T t);

    T queryModelById(@Param("id") int id);

}
