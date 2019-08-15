package com.newer.ksgl.model.mapper;

import com.newer.ksgl.model.pojo.Subject;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SubjectMapper {

    //查询所有
    @Select("select * from subject")
    public List<Subject> findAll();

    //根据id查询
    @Select("select * from subject where sid = #{id}")
    public Subject getSubjectById(Long id);

    //添加数据
    @Insert("insert into subject(name,image) values(#{name},#{image})")
    public void add(Subject subject);

    //通过id修改数据
    @Update("update subject set name=#{name},image=#{image} where sid=#{sid}")
    public void updateById(Subject subject);

    //根据id删除
    @Delete("delete from subject where sid=#{sid}")
    public void deleteById(Long sid);
}
