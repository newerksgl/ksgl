package com.newer.ksgl.model.mapper;

import com.newer.ksgl.model.pojo.Privacy;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 隐私操作类
 * @author 谢涛
 * */
@Mapper
public interface PrivacyMapper {

    /**
     * 添加隐私
     * @param privacy 隐私类
     * @return Integer
     * */
    @Insert("insert into privacy values(null,#{head},#{realname},#{idnumber},#{phone},#{sex},#{culture},#{address})")
    Integer insert(Privacy privacy);

    /**
     * 删除隐私
     * @param pri_id 隐私id
     * @return Integer
     * */
    @Insert("delete from privacy where pri_id")
    Integer deleteById(Integer pri_id);

    /**
     * 修改隐私
     * @param privacy 隐私类
     * @return Integer
     * */
    @Insert("update privacy set head=#{head},realname=#{realname},idnumber=#{idnumber},phone=#{phone},sex=#{sex},culture=#{culture},address=#{address} where pri_id=#{pri_id}")
    Integer update(Privacy privacy);

    /**
     * 查询所有隐私
     * @return List<Privacy>
     * */
    @Select("select * from privacy")
    List<Privacy> findAll();

    /**
     * 查询个人隐私
     * @param pri_id 隐私id
     * @return Privacy
     * */
    @Select("select * from privacy where pri_id=#{pri_id}")
    Privacy selectById(Integer pri_id);

}
