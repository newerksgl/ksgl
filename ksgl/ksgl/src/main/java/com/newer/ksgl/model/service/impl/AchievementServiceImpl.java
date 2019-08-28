package com.newer.ksgl.model.service.impl;

import com.newer.ksgl.model.mapper.AchievementMapper;
import com.newer.ksgl.model.pojo.Achievement;
import com.newer.ksgl.model.service.AchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AchievementServiceImpl implements AchievementService {

    @Autowired
    public AchievementMapper mapper;

    @Override
    public List<Achievement> findAll() {
        return mapper.findAll();
    }

    @Override
    public Achievement findById(Long id) {
        return mapper.findById(id);
    }

    @Override
    public Integer add(Achievement ach) {
        return mapper.add(ach);
    }

    @Override
    public Integer updateById(Achievement ach) {
        return mapper.updateById(ach);
    }

    @Override
    public Integer deleteById(Achievement aid) {
        return mapper.deleteById(aid);
    }
}
