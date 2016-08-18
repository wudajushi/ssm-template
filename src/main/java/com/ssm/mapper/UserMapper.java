package com.ssm.mapper;

import java.util.List;
import java.util.Map;

import com.ssm.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Byte id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Byte id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    List<User> selectAll(Map<String,Object>map);
}