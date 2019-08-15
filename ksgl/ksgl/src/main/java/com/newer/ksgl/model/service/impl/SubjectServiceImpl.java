package com.newer.ksgl.model.service.impl;

import com.newer.ksgl.model.mapper.SubjectMapper;
import com.newer.ksgl.model.pojo.Subject;
import com.newer.ksgl.model.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private SubjectMapper mapper;

    @Override
    public List<Subject> findAll() {
        return mapper.findAll();
    }

    @Override
    public Subject getSubjectById(Long id) {
        return mapper.getSubjectById(id);
    }

    @Override
    public void add(Subject subject) {
        mapper.add(subject);
    }

    @Override
    public void updateById(Subject subject) {
        mapper.updateById(subject);
    }

    @Override
    public void deleteById(Long sid) {
        mapper.deleteById(sid);
    }
}
