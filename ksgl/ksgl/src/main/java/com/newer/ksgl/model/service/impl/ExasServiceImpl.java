package com.newer.ksgl.model.service.impl;

import com.newer.ksgl.model.mapper.ExasMapper;
import com.newer.ksgl.model.pojo.Exas;
import com.newer.ksgl.model.pojo.Question;
import com.newer.ksgl.model.pojo.Subject;
import com.newer.ksgl.model.service.ExasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExasServiceImpl implements ExasService {
    @Autowired
    private ExasMapper mapper;
    @Override
    public List<Exas> findAll() {
        return mapper.findAll();
    }

    @Override
    public void deleteById(Long id) {
        mapper.deleteById(id);
    }

    @Override
    public Exas findById(Long id) {
        return mapper.findById(id);
    }

    @Override
    public void updateById(Long sid, Long qid, Exas e) {
        mapper.updateById(sid,qid,e);
    }

    @Override
    public void add(Long sid, Long qid, Exas e) {
        mapper.add(sid,qid,e);
    }

    @Override
    public List<Exas> find(Exas exas, Integer rows, Integer pageSize) {
        return mapper.find(exas,rows,pageSize);
    }

    @Override
    public Integer findRowCount(Exas exas) {
        return mapper.findRowCount(exas);
    }
}
