package com.newer.ksgl.model.mapper;

import com.newer.ksgl.model.pojo.pojopage.ExaminationsSubjectRegionPage;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Mapper
public interface ExaminationsSubjectRegionPageMapper {
    //表连接多样分页查询
    @Select("<script>" +
            "select * from examinations e inner join subject s on e.sid = s.sid inner join region r on e.reid = r.reid where 1=1 " +
            "<if test='p.id!=null'>and e.id=#{p.id}</if>" +
            "<if test='p.sid!=null'>and e.sid=#{p.sid}</if>" +
            "<if test='p.reid!=null'>and e.reid=#{p.reid}</if>" +
            "<if test='p.statetest!=null'>and e.statetest like #{p.statetest}</if>" +
            "<if test='p.name!=null'>and e.name like #{p.name}</if>" +
            "limit #{row},#{pageSize}</script>")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "number",property = "number"),
            @Result(column = "statetest",property = "statetest"),
            @Result(column = "sid",property = "s",one = @One(select = "com.newer.ksgl.model.mapper.SubjectMapper.getSubjectById",fetchType = FetchType.EAGER)),
            @Result(column = "reid",property = "r",one = @One(select = "com.newer.ksgl.model.mapper.RegionMapper.findById",fetchType = FetchType.EAGER))
    })
    public List<ExaminationsSubjectRegionPage> find(@Param("p") ExaminationsSubjectRegionPage page,@Param("row")Integer row,@Param("pageSize")Integer pageSize);

    //表连接查询总数据行数
    @Select("<script>" +
            "select count(*) from examinations e inner join subject s on e.sid = s.sid inner join region r on e.reid = r.reid where 1=1 " +
            "<if test='p.sid!=null'>and e.sid=#{p.sid}</if>" +
            "<if test='p.reid!=null'>and e.reid=#{p.reid}</if>" +
            "<if test='p.statetest!=null'>and e.statetest like #{p.statetest}</if>" +
            "<if test='p.name!=null'>and e.name like #{p.name}</if>" +
            "</script>")
    public Integer findRowCount(@Param("p") ExaminationsSubjectRegionPage page);
}
