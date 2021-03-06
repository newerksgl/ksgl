package com.newer.ksgl.model.service;

import com.newer.ksgl.model.pojo.Subject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubjectService {
    //查询所有
    public List<Subject> findAll();

    //根据id查询
    public Subject getSubjectById(Long id);

    //添加数据
    public void add(Subject subject);

    //通过id修改数据
    public void updateById(Subject subject);

    //根据id删除
    public void deleteById(Long sid);
}
