package com.newer.ksgl.model.service.impl;

import com.newer.ksgl.model.mapper.RecycleMapper;
import com.newer.ksgl.model.pojo.Recycle;
import com.newer.ksgl.model.service.RecycleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecycleServiceImpl implements RecycleService {
    @Autowired
    private RecycleMapper mapper;

    @Override
    public List<Recycle> findAll() {
        return mapper.findAll();
    }

    @Override
    public Recycle findById(Long rid) {
        return mapper.findById(rid);
    }

    @Override
    public void add(Recycle recycle) {
        mapper.add(recycle);
    }

    @Override
    public void update(Recycle recycle) {
        mapper.update(recycle);
    }

    @Override
    public void deleteById(Long id) {
        mapper.deleteById(id);
    }
}
