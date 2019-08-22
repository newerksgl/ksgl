package com.newer.ksgl.model.mapper;

import com.newer.ksgl.model.pojo.Question;
import com.newer.ksgl.model.pojo.Subject;
import com.newer.ksgl.model.pojo.pojopage.ExasSubjectQuestionPage;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Mapper
public interface ExasSubjectQuestionPageMapper {
    //表连接多样查询分页
    @Select("<script>" +
            "select * from exas e inner join `subject` s on e.SID=s.SID inner join question q on e.QID=q.QID where 1=1 " +
            "<if test='p.eid!=null'>and e.eid=#{p.eid}</if>" +
            "<if test='p.qid!=null'>and e.qid=#{p.qid}</if>" +
            "<if test='p.sid!=null'>and e.sid=#{p.sid}</if>" +
            "<if test='p.questionStem!=null'> and e.QuestionStem like #{p.questionStem}</if> " +
            "<if test='p.reference!=null'>and e.Reference like #{p.reference}</if> " +
            "<if test='p.problem!=null'>and e.problem like #{p.problem}</if>" +
            "<if test='p.difficulty!=null'>and e.difficulty like #{p.difficulty}</if>" +
            "<if test='p.date!=null'>and e.date like #{p.date}</if>" +
            "<if test='p.s!=null'>"+
            "<if test='p.s.name!=null'>and s.name like #{p.s.name}</if>" +
            "</if>" +
            "<if test='p.q!=null'>" +
            "<if test='p.q.question!=null'>and q.question like #{p.q.question}</if>" +
            "<if test='p.q.questionTest!=null'>and q.questionTest like #{p.q.questionTest}</if>" +
            "</if>" +
            " limit #{row},#{pageSize}</script>")
    @Results(value = {
            @Result(id = true,column = ("eid"),property = "eid"),
            @Result(column = "questionstem",property = "questionStem"),
            @Result(column = "reference",property = "reference"),
            @Result(column = "problem",property = "problem"),
            @Result(column = "difficulty",property = "difficulty"),
            @Result(column = "date",property = "date"),
            @Result(column = "sid",property = "s",javaType = Subject.class,one =@One(select = "com.newer.ksgl.model.mapper.SubjectMapper.getSubjectById",fetchType = FetchType.EAGER)),
            @Result(column = "qid",property = "q",javaType = Question.class,one =@One(select = "com.newer.ksgl.model.mapper.QuestionMapper.getQuestionById",fetchType = FetchType.EAGER))
    })
    public List<ExasSubjectQuestionPage> find(@Param("p") ExasSubjectQuestionPage page,@Param("row") Integer row,@Param("pageSize") Integer pageSize);


    //表连接查询总数据行数
    @Select("<script>" +
            "select count(*) from exas e inner join `subject` s on e.SID=s.SID inner join question q on e.QID=q.QID where 1=1" +
            "<if test='p.eid!=null'>and e.eid=#{p.eid}</if>" +
            "<if test='p.qid!=null'>and e.qid=#{p.qid}</if>" +
            "<if test='p.sid!=null'>and e.sid=#{p.sid}</if>" +
            "<if test='p.questionStem!=null'> and e.QuestionStem like #{p.questionStem}</if> " +
            "<if test='p.reference!=null'>and e.Reference like #{p.reference}</if> " +
            "<if test='p.problem!=null'>and e.problem like #{p.problem}</if>" +
            "<if test='p.difficulty!=null'>and e.difficulty like #{p.difficulty}</if>" +
            "<if test='p.date!=null'>and e.date like #{p.date}</if>" +
            "<if test='p.s!=null'>"+
            "<if test='p.s.name!=null'>and s.name like #{p.s.name}</if>" +
            "</if>" +
            "<if test='p.q!=null'>" +
            "<if test='p.q.question!=null'>and q.question like #{p.q.question}</if>" +
            "<if test='p.q.questionTest!=null'>and q.questionTest like #{p.q.questionTest}</if>" +
            "</if>" +
            "</script>")
    public Integer findRowCount(@Param("p") ExasSubjectQuestionPage page);
}
