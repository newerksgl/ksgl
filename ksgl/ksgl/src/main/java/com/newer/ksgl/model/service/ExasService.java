package com.newer.ksgl.model.service;

import com.newer.ksgl.model.pojo.Exas;
import com.newer.ksgl.model.pojo.Question;
import com.newer.ksgl.model.pojo.Subject;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExasService {
    //查询所有
    public List<Exas> findAll();
    //根据id删除
    public void deleteById(Long id);
    //根据id查询
    public Exas findById(Long id);
    //通过id修改数据
    public void updateById(Long sid, Long qid, Exas e);
    //添加数据
    public void add(Long sid, Long qid, Exas e);
    //多样查询分页
    public List<Exas> find(Exas exas,Integer rows,Integer pageSize);
    //查询总数据行数
    public Integer findRowCount( Exas exas);
}
