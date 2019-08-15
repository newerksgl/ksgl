package com.newer.ksgl.model.mapper;

import com.newer.ksgl.model.pojo.Exas;
import com.newer.ksgl.model.pojo.Question;
import com.newer.ksgl.model.pojo.Subject;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ExasMapper extends ExasMapperImpl {
    //查询所有Exas表的数据
    @Select("select * from Exas")
    public List<Exas> findAll();

    //通过编号id删除数据
    @Delete("delete from Exas where EID = #{id}")
    public void deleteById(@Param("id") Long id);

    //通过id查找数据
    @Select("select * from exas where eid = #{id}")
    public Exas getExasById(@Param("id") Long id);

    //通过id进行修改
    @Update("update exas set SID=#{sid},QID=#{qid},Quetion_Stem=#{e.questionStem},Reference=#{e.reference},Problem=#{e.problem},Difficulty=#{e.difficulty} where eid=#{e.eid}")
    public void updateById(@Param("sid") Long sid, @Param("qid") Long qid, @Param("e") Exas e);

    //进行添加数据
    @Insert("insert into exas(SID,QID,question_stem,reference,problem,difficulty,date) values(#{sid},#{qid},#{e.questionStem},#{e.reference},#{e.problem},#{e.difficulty},SYSDATE())")
    public void add(@Param("sid") Long sid, @Param("qid") Long qid, @Param("e") Exas e);
}
