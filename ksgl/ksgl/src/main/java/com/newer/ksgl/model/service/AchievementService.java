package com.newer.ksgl.model.service;

import com.newer.ksgl.model.pojo.Achievement;

import java.util.List;

public interface AchievementService {

    // 查询所有
    public List<Achievement> findAll();

    // 通过id查询
    public Achievement findById(Long id);

    // 添加数据
    public Integer add(Achievement ach);

    // 通过id修改数据
    public Integer updateById(Achievement ach);

    // 通过id删除数据
    public Integer deleteById(Achievement aid);

}
