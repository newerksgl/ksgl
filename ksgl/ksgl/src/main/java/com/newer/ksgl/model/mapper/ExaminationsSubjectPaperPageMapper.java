package com.newer.ksgl.model.mapper;

import com.newer.ksgl.model.pojo.Paper;
import com.newer.ksgl.model.pojo.pojopage.ExaminationsSubjectPaperPage;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Mapper
public interface ExaminationsSubjectPaperPageMapper {
    @Select("<script>" +
            "select * from examinations e,`subject` s,paper p where e.SID=s.SID and s.SID=p.SID" +
            "<if test='id!=null'> and id = #{id}</if>" +
            "<if test='number!=null'>and number like #{number}</if>" +
            "<if test='statetest!=null'>and statetest like #{statetest}</if>" +
            "<if test='name!=null'>and e.name like #{name}</if>" +
            "<if test='s!=null'>" +
            "<if test='s.name!=null'>and s.name like #{s.name}</if>" +
            "</if>" +
            "<if test='p!=null'>" +
            "<if test='p.pName!=null'>and p.pname like #{p.pName}</if>" +
            "</if>" +
            "</script>")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "number",property = "number"),
            @Result(column = "statetest",property = "statetest"),
            @Result(column = "name",property = "name"),
            @Result(column = "sid",property = "s",one = @One(select = "com.newer.ksgl.model.mapper.SubjectMapper.getSubjectById",fetchType = FetchType.EAGER)),
            @Result(column = "pid",property = "p",one = @One(select = "com.newer.ksgl.model.mapper.ExaminationsSubjectPaperPageMapper.getPaperById",fetchType = FetchType.EAGER))
    })
    List<ExaminationsSubjectPaperPage> find(ExaminationsSubjectPaperPage p);

    @Select("select * from paper where pid = #{id}")
    Paper getPaperById(Long id);
}
