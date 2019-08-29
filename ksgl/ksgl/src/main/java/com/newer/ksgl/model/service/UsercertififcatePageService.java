package com.newer.ksgl.model.service;

import com.newer.ksgl.model.pojo.Usercertificate;
import com.newer.ksgl.model.pojo.pojopage.UsercertificatePage;

import java.util.List;

public interface UsercertififcatePageService {
    public List<UsercertificatePage> selectname(String name);
    public int insert(Usercertificate usercertificate);
}
