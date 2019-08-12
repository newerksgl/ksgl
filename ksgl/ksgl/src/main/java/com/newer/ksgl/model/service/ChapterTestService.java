package com.newer.ksgl.model.service;

import com.newer.ksgl.model.pojo.Chaptertest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ChapterTestService {
    //查询所有
    public List<Chaptertest> findAll();

    //根据id查询
    public Chaptertest findById(Long id);

    //添加数据
    public void add(Chaptertest chaptertest);

    //通过id修改数据
    public void updateById(Chaptertest chaptertest);

    //根据id删除
    public void deleteById(Long id);
}
