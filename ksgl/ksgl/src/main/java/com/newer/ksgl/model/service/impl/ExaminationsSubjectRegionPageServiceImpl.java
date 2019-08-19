package com.newer.ksgl.model.service.impl;

import com.newer.ksgl.model.mapper.ExaminationsSubjectRegionPageMapper;
import com.newer.ksgl.model.pojo.pojopage.ExaminationsSubjectRegionPage;
import com.newer.ksgl.model.service.ExaminationsSubjectRegionPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExaminationsSubjectRegionPageServiceImpl implements ExaminationsSubjectRegionPageService {
    @Autowired
    private ExaminationsSubjectRegionPageMapper mapper;

    @Override
    public List<ExaminationsSubjectRegionPage> find(ExaminationsSubjectRegionPage page, Integer row, Integer pageSize) {
        return mapper.find(page,row,pageSize);
    }

    @Override
    public Integer findRowCount(ExaminationsSubjectRegionPage page) {
        return mapper.findRowCount(page);
    }
}
