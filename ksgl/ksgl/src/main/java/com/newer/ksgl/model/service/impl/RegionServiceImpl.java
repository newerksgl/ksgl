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

    @Override
    public List<Region> findAll() {
        return mapper.findAll();
    }

    @Override
    public Region findById(Long reid) {
        return mapper.findById(reid);
    }

    @Override
    public void add(Region region) {
        mapper.add(region);
    }

    @Override
    public void updateById(Region region) {
        mapper.updateById(region);
    }

    @Override
    public void deleteById(Long id) {
        mapper.deleteById(id);
    }
}
