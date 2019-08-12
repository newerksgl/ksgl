package com.newer.ksgl.model.service;

import com.newer.ksgl.model.pojo.Region;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RegionService {
    //查询所有
    public List<Region> findAll();

    //根据id查询
    public Region findById(Long reid);

    //添加数据
    public void add(Region region);

    //通过id修改数据
    public void updateById(Region region);

    //根据id删除
    public void deleteById(Long id);
}
