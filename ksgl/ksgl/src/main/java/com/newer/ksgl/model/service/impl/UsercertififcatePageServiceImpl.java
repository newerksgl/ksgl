package com.newer.ksgl.model.service.impl;

import com.newer.ksgl.model.mapper.UsercertificatePageMapper;
import com.newer.ksgl.model.pojo.Usercertificate;
import com.newer.ksgl.model.pojo.pojopage.UsercertificatePage;
import com.newer.ksgl.model.service.UsercertififcatePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsercertififcatePageServiceImpl implements UsercertififcatePageService {
    @Autowired
    private UsercertificatePageMapper mapper;
    @Override
    public List<UsercertificatePage> selectname(String name) {
        return mapper.selectAll(name);
    }

    @Override
    public int insert(Usercertificate usercertificate) {
        return mapper.insert(usercertificate);
    }
}
