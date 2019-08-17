package com.newer.ksgl.model.service;

import com.newer.ksgl.model.pojo.Certificate;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CertificateService {

    //查询所有
    public List<Certificate> findAll();

    //通过id查询
    public Certificate findById(Long id);

    //添加数据
    public Integer add(Certificate cert);

    //通过id修改
    public Integer updateById(Certificate cert);

    //通过id删除
    public Integer deleteById(Long id);

}
