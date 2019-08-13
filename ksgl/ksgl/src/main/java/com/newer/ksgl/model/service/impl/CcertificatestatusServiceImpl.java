package com.newer.ksgl.model.service.impl;

import com.newer.ksgl.model.mapper.CcertificatestatusMapper;
import com.newer.ksgl.model.pojo.Ccertificatestatus;
import com.newer.ksgl.model.service.CcertificatestatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CcertificatestatusServiceImpl implements CcertificatestatusService {

    @Autowired
    private CcertificatestatusMapper mapper;


    @Override
    public List<Ccertificatestatus> findAll() {
        return mapper.findAll();
    }


    @Override
    public Ccertificatestatus findById(Long id) {
        return mapper.findById(id);
    }

    @Override
    public Integer add(Ccertificatestatus ccer) {
        return mapper.add(ccer);
    }

    @Override
    public Integer updateById(Ccertificatestatus ccer) {
        return mapper.updateById(ccer);
    }

    @Override
    public Integer delete(Long csid) {
        return mapper.delete(csid);
    }
}
