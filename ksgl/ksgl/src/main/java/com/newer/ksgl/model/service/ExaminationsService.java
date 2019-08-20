package com.newer.ksgl.model.service;

import com.newer.ksgl.model.pojo.Examinations;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExaminationsService {
    //查询所有
    public List<Examinations> findAll();

    //根据id查询数据
    public Examinations findById(Long id);

    //添加数据
    public void add(Examinations e);

    //通过id修改数据
    public void update(Examinations e);

    //根据id删除数据
    public void del(Long id);

    //多样查询分页
    public List<Examinations> find(Examinations e,Integer row,Integer pageSize);

    //查询总数据行数
    public Integer findRowCount(Examinations e);

    //通过id开通考场
    public void kaiTong(Long id);
}
