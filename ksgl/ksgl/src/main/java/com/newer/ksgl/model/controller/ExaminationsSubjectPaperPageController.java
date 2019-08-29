package com.newer.ksgl.model.controller;

import com.newer.ksgl.model.pojo.pojopage.ExaminationsSubjectPaperPage;
import com.newer.ksgl.model.service.ExaminationsSubjectPaperPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
@RequestMapping("/ExaminationsSubjectPaperPage")
public class ExaminationsSubjectPaperPageController {
    @Autowired
    private ExaminationsSubjectPaperPageService service;

    @ResponseBody
    @RequestMapping("/find")
    public List<ExaminationsSubjectPaperPage> find(ExaminationsSubjectPaperPage p){
        return service.find(p);
    }
}
