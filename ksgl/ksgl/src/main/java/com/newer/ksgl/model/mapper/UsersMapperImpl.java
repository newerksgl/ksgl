package com.newer.ksgl.model.mapper;

import com.newer.ksgl.model.pojo.Users;
import org.apache.ibatis.annotations.Select;

public interface UsersMapperImpl {
    @Select("select * from Users where name=#{name}")
    Users selectByName(String name);
}