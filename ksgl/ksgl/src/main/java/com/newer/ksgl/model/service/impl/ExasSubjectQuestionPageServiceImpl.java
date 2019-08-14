package com.newer.ksgl.model.service.impl;

import com.newer.ksgl.model.mapper.ExasSubjectQuestionPageMapper;
import com.newer.ksgl.model.pojo.pojopage.ExasSubjectQuestionPage;
import com.newer.ksgl.model.service.ExasSubjectQuestionPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExasSubjectQuestionPageServiceImpl implements ExasSubjectQuestionPageService {
    @Autowired
    private ExasSubjectQuestionPageMapper mapper;

    @Override
    public List<ExasSubjectQuestionPage> find(ExasSubjectQuestionPage page, Integer row, Integer pageSize) {
        return mapper.find(page,row,pageSize);
    }

    @Override
    public Integer findRowCount(ExasSubjectQuestionPage page) {
        return mapper.findRowCount(page);
    }
}
