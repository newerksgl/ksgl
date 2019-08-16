package com.newer.ksgl.model.mapper;

import com.newer.ksgl.model.pojo.Examinations;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ExaminationsMapperImpl {
    //多样查询分页
    @Select("<script>" +
            "select * from examinations where 1=1" +
            "<if test='e.sid!=null'>and sid=#{e.sid}</if>" +
            "<if test='e.reid!=null'>and reid=#{e.reid}</if>" +
            "<if test='e.number!=null'>and number=#{e.number}</if>" +
            "<if test='e.statetest!=null'>and statetest like #{e.statetest}</if>" +
            "<if test='e.name!=null'>and name like #{e.name}</if>" +
            "limit #{row},#{pageSize}</script>")
    public List<Examinations> find(@Param("e") Examinations e,@Param("row") Integer row,@Param("pageSize") Integer pageSize);

    //查询总数据行数
    @Select("<script>" +
            "select count(*) from examinations where 1=1" +
            "<if test='e.sid!=null'>and sid=#{e.sid}</if>" +
            "<if test='e.reid!=null'>and reid=#{e.reid}</if>" +
            "<if test='e.number!=null'>and number=#{e.number}</if>" +
            "<if test='e.statetest!=null'>and statetest like #{e.statetest}</if>" +
            "<if test='e.name!=null'>and name like #{e.name}</if>" +
            "</script>")
    public Integer findRowCount(@Param("e") Examinations e);
}
