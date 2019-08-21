package com.newer.ksgl.model.mapper;

import com.newer.ksgl.model.pojo.Userrole;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 角色操作类
 * @author 谢涛
 * */
@Mapper
public interface UserroleMapper {

    /**
     * 添加角色方法
     * @param userrole 角色类
     * @return Integer
     * */
    @Insert("insert into userrole values(null,#{role_name},#{defaultrole},#{description},#{isadmin})")
    Integer insert(Userrole userrole);

    /**
     * 删除角色方法
     * @param rid 角色id
     * @return Integer
     * */
    @Delete("delete from userrole where rid=#{rid}")
    Integer deleteById(Integer rid);

    /**
     * 修改角色方法
     * @param userrole
     * @return Integer
     * */
    @Update("update userrole set role_name=#{role_name},defaultrole=#{defaultrole},description=#{description},isadmin=#{isadmin} where rid=#{rid}")
    Integer update(Userrole userrole);

    /**
     * 查询所有角色方法
     * @return List<Userrole>
     * */
    @Select("select * from userrole")
    List<Userrole> findAll();

    /**
     * 查询单个角色方法
     * @param rid 角色id
     * @return Userrole
     * */
    @Select("select * from userrole where rid=#{rid}")
    Userrole selectById(Integer rid);

}
