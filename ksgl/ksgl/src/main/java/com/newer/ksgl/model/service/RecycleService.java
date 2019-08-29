package com.newer.ksgl.model.service;

import com.newer.ksgl.model.pojo.Recycle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RecycleService {

    // 查询所有
    public List<Recycle> findAll();

    // 根据ID查询
    public Recycle findById(Long rid);

    // 添加数据
    public void add(Recycle recycle);

    // 通过ID修改数据
    public void update(Recycle recycle);

    // 根据ID删除
    public void deleteById(Long id);

}
