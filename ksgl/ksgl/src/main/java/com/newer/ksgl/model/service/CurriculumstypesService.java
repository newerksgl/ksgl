package com.newer.ksgl.model.service;

import com.newer.ksgl.model.pojo.Curriculumstypes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CurriculumstypesService {
    //查询所有
    public List<Curriculumstypes> findAll();

    //根据id查询
    public Curriculumstypes findById(Long id);

    //添加数据
    public void add(Curriculumstypes curriculumstypes);

    //通过id修改数据
    public void updateById(Curriculumstypes curriculumstypes);

    //根据id删除
    public void deleteById(Long id);

    //多样查询分页
    public List<Curriculumstypes> find(Curriculumstypes c,Integer row,Integer pageSize);

    //查询总数据
    public Integer findRowCount(Curriculumstypes c);
}
