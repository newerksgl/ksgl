package com.newer.ksgl.model.mapper;

import com.newer.ksgl.model.pojo.Exas;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface ExasMapperImpl {
    //多样查询分页
    @Select("<script>" +
            "select * from exas where 1=1 " +
            "<if test='e.questionStem!=null'> and QuestionStem like #{e.questionStem}</if> " +
            "<if test='e.reference!=null'>and Reference like #{e.reference}</if> " +
            "<if test='e.problem!=null'>and problem like #{e.problem}</if>" +
            "<if test='e.difficulty!=null'>and difficulty like #{e.difficulty}</if>" +
            "<if test='e.sid!=null'>and sid = #{e.sid}</if>" +
            "<if test='e.qid!=null'>and qid = #{e.qid}</if>" +
            "<if test='e.date!=null'>and date like #{e.date}</if>" +
            "limit #{row},#{pageSize}</script>")
    public List<Exas> find(@Param("e") Exas exas, @Param("row") Integer row, @Param("pageSize") Integer pageSize);

    //查询总数据行数
    @Select("<script>" +
            "select count(*) from exas where 1=1 " +
            "<if test='e.questionStem!=null'> and QuestionStem like #{e.questionStem}</if> " +
            "<if test='e.reference!=null'>and Reference like #{e.reference}</if> " +
            "<if test='e.problem!=null'>and problem like #{e.problem}</if>" +
            "<if test='e.difficulty!=null'>and difficulty like #{e.difficulty}</if>" +
            "<if test='e.sid!=null'>and sid = #{e.sid}</if>" +
            "<if test='e.qid!=null'>and qid = #{e.qid}</if>" +
            "<if test='e.date!=null'>and date like #{e.date}</if>" +
            "</script>")
    public Integer findRowCount(@Param("e") Exas exas);
}
