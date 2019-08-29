package com.newer.ksgl.model.service;

import com.newer.ksgl.model.pojo.pojopage.ExaminationsSubjectPaperPage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ExaminationsSubjectPaperPageService {
    List<ExaminationsSubjectPaperPage> find(ExaminationsSubjectPaperPage p);
}
