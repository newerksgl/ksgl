package com.newer.ksgl.model.mapper;

import com.newer.ksgl.model.pojo.Achievement;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AchievementMapper {

    // 查询所有
    @Select("select * from Achievement")
    public List<Achievement> findAll();

    // 通过id查询
    @Select("select * from Achievement where aid = #{aid}")
    public Achievement findById(Long id);

    // 添加数据
    @Insert("insert into Achievement(pid, name, fraction, pname) value(#{pid}, #{name}, #{fraction}, #{pName})")
    public Integer add(Achievement ach);

    // 通过id修改数据
    @Update("update Achievement set pid=#{pid}, name=#{name}, fraction#{fraction}, pname=#{pname} where aid=#{aid}")
    public Integer updateById(Achievement ach);

    // 通过id删除数据
    @Delete("delete from Achievemetn where aid=#{id}")
    public Integer deleteById(Achievement aid);
}
