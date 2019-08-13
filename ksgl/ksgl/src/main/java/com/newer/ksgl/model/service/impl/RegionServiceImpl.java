package com.newer.ksgl.model.service.impl;

import com.newer.ksgl.model.mapper.RegionMapper;
import com.newer.ksgl.model.pojo.Region;
import com.newer.ksgl.model.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionServiceImpl implements RegionService {
    @Autowired
    private RegionMapper mapper;

    //查询所有
    @Override
    public List<Region> findAll() {
        return mapper.findAll();
    }

    //根据id查询
    @Override
    public Region findById(Long reid) {
        return mapper.findById(reid);
    }

    //添加数据
    @Override
    public void add(Region region) {
        mapper.add(region);
    }

    //通过id修改数据
    @Override
    public void updateById(Region region) {
        mapper.updateById(region);
    }

    //根据id删除
    @Override
    public void deleteById(Long id) {
        mapper.deleteById(id);
    }
}
