package com.newer.ksgl.model.service.impl;

import com.newer.ksgl.model.mapper.ExaminationsMapper;
import com.newer.ksgl.model.pojo.Examinations;
import com.newer.ksgl.model.service.ExaminationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExaminationsServiceImpl implements ExaminationsService {
    @Autowired
    private ExaminationsMapper mapper;

    @Override
    public List<Examinations> findAll() {
        return mapper.findAll();
    }

    @Override
    public Examinations findById(Long id) {
        return mapper.findById(id);
    }

    @Override
    public void add(Examinations e) {
        mapper.add(e);
    }

    @Override
    public void update(Examinations e) {
        mapper.update(e);
    }

    @Override
    public void del(Long id) {
        mapper.del(id);
    }

    @Override
    public List<Examinations> find(Examinations e, Integer row, Integer pageSize) {
        return mapper.find(e,row,pageSize);
    }

    @Override
    public Integer findRowCount(Examinations e) {
        return mapper.findRowCount(e);
    }

    @Override
    public void kaiTong(Long id) {
        mapper.kaiTong(id);
    }

}
