package com.newer.ksgl.model.mapper;

import com.newer.ksgl.model.pojo.Question;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface QuestionMapper {
    //查询所有
    @Select("select * from question")
    public List<Question> findAll();

    //根据id查询
    @Select("select * from question where qid=#{id}")
    public Question finById(Long id);

    //添加数据
    @Insert("insert into question(question,questiontest) values(#{question},#{questiontest})")
    public void add(Question question);

    //通过id修改数据
    @Update("update question set question=#{question},questiontest=#{questiontest} where qid=#{qid}")
    public void updateById(Question question);

    //根据id删除数据
    @Delete("delete from question where qid=#{qid}")
    public void deleteById(Long qid);
}
