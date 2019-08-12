package com.newer.ksgl.model.service.impl;

import com.newer.ksgl.model.mapper.CurriculumstypesMapper;
import com.newer.ksgl.model.pojo.Curriculumstypes;
import com.newer.ksgl.model.service.CurriculumstypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurriculumstypesServiceImpl implements CurriculumstypesService {
    @Autowired
    private CurriculumstypesMapper mapper;


    @Override
    public List<Curriculumstypes> findAll() {
        return mapper.findAll();
    }

    @Override
    public Curriculumstypes findById(Long id) {
        return mapper.findById(id);
    }

    @Override
    public void add(Curriculumstypes curriculumstypes) {
        mapper.add(curriculumstypes);
    }

    @Override
    public void updateById(Curriculumstypes curriculumstypes) {
        mapper.updateById(curriculumstypes);
    }

    @Override
    public void deleteById(Long id) {
        mapper.deleteById(id);
    }
}
