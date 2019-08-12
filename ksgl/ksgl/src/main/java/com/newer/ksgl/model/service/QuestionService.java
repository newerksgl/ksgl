package com.newer.ksgl.model.service;

import com.newer.ksgl.model.pojo.Question;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface QuestionService {
    //查询所有
    public List<Question> findAll();

    //根据id查询
    public Question finById(Long id);

    //添加数据
    public void add(Question question);

    //通过id修改数据
    public void updateById(Question question);

    //根据id删除数据
    public void deleteById(Long qid);
}
