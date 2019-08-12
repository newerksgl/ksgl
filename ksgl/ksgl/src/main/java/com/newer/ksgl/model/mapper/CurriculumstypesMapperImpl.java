package com.newer.ksgl.model.mapper;

import com.newer.ksgl.model.pojo.Curriculumstypes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CurriculumstypesMapperImpl {
    //多样查询分页
    @Select("<script>" +
            "select * from curriculumstypes where 1=1" +
            "<if test='c.ctid!=null'>and ctid=#{c.ctid}</if>" +
            "<if test='c.title!=null'>and title like #{c.title}</if>" +
            "<if test='c.address!=null'>and address like #{c.address}</if>" +
            "<if test='c.introduce!=null'>introaduce like #{c.introduce}</if>" +
            "limit #{row},#{pageSize}</script>")
    public List<Curriculumstypes> find(@Param("c") Curriculumstypes c, @Param("row") Integer row, @Param("pageSize") Integer pageSize);

    //查询总数据行数
    @Select("<script>" +
            "select count(*) from curriculumstypes where 1=1" +
            "<if test='c.ctid!=null'>and ctid=#{c.ctid}</if>" +
            "<if test='c.title!=null'>and title like #{c.title}</if>" +
            "<if test='c.address!=null'>and address like #{c.address}</if>" +
            "<if test='c.introduce!=null'>introaduce like #{c.introduce}</if></script>")
    public Integer findRowCount(@Param("c") Curriculumstypes c);
}
