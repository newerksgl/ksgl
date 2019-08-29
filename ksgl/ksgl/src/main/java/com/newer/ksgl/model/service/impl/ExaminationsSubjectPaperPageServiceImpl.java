package com.newer.ksgl.model.service.impl;

import com.newer.ksgl.model.mapper.ExaminationsSubjectPaperPageMapper;
import com.newer.ksgl.model.pojo.pojopage.ExaminationsSubjectPaperPage;
import com.newer.ksgl.model.service.ExaminationsSubjectPaperPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExaminationsSubjectPaperPageServiceImpl implements ExaminationsSubjectPaperPageService {
    @Autowired
    private ExaminationsSubjectPaperPageMapper mapper;

    @Override
    public List<ExaminationsSubjectPaperPage> find(ExaminationsSubjectPaperPage p) {
        return mapper.find(p);
    }
}
