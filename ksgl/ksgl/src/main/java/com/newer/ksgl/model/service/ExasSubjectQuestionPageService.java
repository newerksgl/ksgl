package com.newer.ksgl.model.service;

import com.newer.ksgl.model.pojo.pojopage.ExasSubjectQuestionPage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExasSubjectQuestionPageService {
    //表连接多样查询分页
    public List<ExasSubjectQuestionPage> find(ExasSubjectQuestionPage page,Integer row, Integer pageSize);

    //表连接查询总数据行数
    public Integer findRowCount(ExasSubjectQuestionPage page);
}
