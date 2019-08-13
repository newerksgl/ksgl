package com.newer.ksgl.model.mapper;

import com.newer.ksgl.model.pojo.pojopage.ExasSubjectQuestionPage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ExasSubjectQuestionPageMapper {

    public List<ExasSubjectQuestionPage> find(@Param("") ExasSubjectQuestionPage page, Integer row, Integer pageSize);
}
