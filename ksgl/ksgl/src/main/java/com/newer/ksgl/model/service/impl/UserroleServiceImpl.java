package com.newer.ksgl.model.service.impl;

import com.newer.ksgl.model.mapper.UserroleMapper;
import com.newer.ksgl.model.pojo.Userrole;
import com.newer.ksgl.model.service.UserroleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserroleServiceImpl implements UserroleService {

    @Autowired
    private UserroleMapper mapper;

    @Override
    public Integer insert(Userrole userrole) {
        return mapper.insert(userrole);
    }

    @Override
    public Integer deleteById(Integer rid) {
        return mapper.deleteById(rid);
    }

    @Override
    public Integer update(Userrole userrole) {
        return mapper.update(userrole);
    }

    @Override
    public List<Userrole> findAll() {
        return mapper.findAll();
    }

    @Override
    public Userrole selectById(Integer rid) {
        return mapper.selectById(rid);
    }
}
