package com.newer.ksgl.model.service.impl;

import com.newer.ksgl.model.mapper.QuestionMapper;
import com.newer.ksgl.model.pojo.Question;
import com.newer.ksgl.model.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {
    @Autowired
    private QuestionMapper mapper;

    @Override
    public List<Question> findAll() {
        return mapper.findAll();
    }

    @Override
    public Question getQuestionById(Long id) {
        return mapper.getQuestionById(id);
    }

    @Override
    public void add(Question question) {
        mapper.add(question);
    }

    @Override
    public void updateById(Question question) {
        mapper.updateById(question);
    }

    @Override
    public void deleteById(Long qid) {
        mapper.deleteById(qid);
    }
}
