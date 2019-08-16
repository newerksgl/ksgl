package com.newer.ksgl.model.service.impl;

import com.newer.ksgl.model.mapper.ChapterTestMapper;
import com.newer.ksgl.model.pojo.Chaptertest;
import com.newer.ksgl.model.service.ChapterTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterTestServiceImpl implements ChapterTestService {
    @Autowired
    private ChapterTestMapper mapper;

    @Override
    public List<Chaptertest> findAll() {
        return mapper.findAll();
    }

    @Override
    public Chaptertest getChapterTestById(Long id) {
        return mapper.getChapterTestById(id);
    }

    @Override
    public void add(Chaptertest chaptertest) {
        mapper.add(chaptertest);
    }

    @Override
    public void updateById(Chaptertest chaptertest) {
        mapper.updateById(chaptertest);
    }

    @Override
    public void deleteById(Long id) {
        mapper.deleteById(id);
    }
}
