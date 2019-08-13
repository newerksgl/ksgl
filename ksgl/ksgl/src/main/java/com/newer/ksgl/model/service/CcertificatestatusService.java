package com.newer.ksgl.model.service;

import com.newer.ksgl.model.pojo.Ccertificatestatus;

import java.util.List;

public interface CcertificatestatusService {

    //查询所有
    public List<Ccertificatestatus> findAll();

    //通过id查询
    public Ccertificatestatus findById(Long id);

    //添加数据
    public Integer add(Ccertificatestatus ccer);

    //通过id修改数据
    public Integer updateById(Ccertificatestatus ccer);

    //通过id删除数据
    public Integer delete(Long csid);
}
