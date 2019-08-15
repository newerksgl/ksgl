package com.newer.ksgl.model.service.impl;

import com.newer.ksgl.model.mapper.CertificateMapper;
import com.newer.ksgl.model.pojo.Certificate;
import com.newer.ksgl.model.pojo.Exas;
import com.newer.ksgl.model.service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CertificateServiceImpl implements CertificateService {
    @Autowired
    private CertificateMapper mapper;

    @Override
    public List<Certificate> findAll() {
        return mapper.findAll();
    }

    @Override
    public Integer add(Certificate cert) {
        return mapper.add(cert);
    }

    @Override
    public Integer updateById(Certificate cert) {
        return mapper.updateById(cert);
    }

    @Override
    public Integer deleteById(Long id) {
        return mapper.deleteById(id);
    }

}

