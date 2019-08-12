package com.newer.ksgl.model.mapper;

import com.newer.ksgl.model.pojo.Curriculumstypes;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CurriculumstypesMapper {

    //查询所有
    @Select("select * from curriculumstypes")
    public List<Curriculumstypes> findAll();

    //根据id查询
    @Select("select * from curriculumstypes where id = #{id}")
    public Curriculumstypes findById(Long id);

    //添加数据
    @Insert("inser into curriculumstypes(ctid,title,image,address,introduce) values(#{ctid},#{title},#{image},#{address},#{introduce})")
    public void add(Curriculumstypes curriculumstypes);

    //通过id修改数据
    @Update("update curriculumstypes set ctid=#{ctid},title=#{title},image=#{image},address=#{address},introduce=#{introduce} where id = #{id}")
    public void updateById(Curriculumstypes curriculumstypes);

    //根据id删除
    @Delete("delete from curriculumstypes where id = #{id}")
    public void deleteById(Long id);
}
