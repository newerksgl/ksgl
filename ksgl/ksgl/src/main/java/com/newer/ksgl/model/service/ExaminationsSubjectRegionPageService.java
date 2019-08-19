package com.newer.ksgl.model.service;

import com.newer.ksgl.model.pojo.pojopage.ExaminationsSubjectRegionPage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExaminationsSubjectRegionPageService {
    //表连接多样分页查询
    public List<ExaminationsSubjectRegionPage> find(ExaminationsSubjectRegionPage page,Integer row,Integer pageSize);

    //表连接查询总数据行数
    public Integer findRowCount(ExaminationsSubjectRegionPage page);
}
