package com.newer.ksgl.model.service.impl;

import com.newer.ksgl.model.mapper.PrivacyMapper;
import com.newer.ksgl.model.pojo.Privacy;
import com.newer.ksgl.model.service.PrivacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrivacyServiceImpl implements PrivacyService {

    @Autowired
    private PrivacyMapper mapper;

    @Override
    public Integer insert(Privacy privacy) {
        return mapper.insert(privacy);
    }

    @Override
    public Integer deleteById(Integer pri_id) {
        return mapper.deleteById(pri_id);
    }

    @Override
    public Integer update(Privacy privacy) {
        return mapper.update(privacy);
    }

    @Override
    public List<Privacy> findAll() {
        return mapper.findAll();
    }

    @Override
    public Privacy selectById(Integer pri_id) {
        return mapper.selectById(pri_id);
    }
}
