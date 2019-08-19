package com.newer.ksgl.model.controller;

import com.newer.ksgl.model.pojo.pojopage.ExaminationsSubjectRegionPage;
import com.newer.ksgl.model.service.ExaminationsSubjectRegionPageService;
import com.newer.ksgl.model.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/examinationsSubjectRegionPage")
public class ExaminationsSubjectRegionPageController {
    @Autowired
    private ExaminationsSubjectRegionPageService service;

    @ResponseBody
    @RequestMapping("/find")
    public PageBean<ExaminationsSubjectRegionPage> find(ExaminationsSubjectRegionPage page,Integer pageNo){
        System.out.println(page);
        if (page.getStatetest()==""){
            page.setStatetest(null);
        }
        Integer pageSize = 1;

        PageBean<ExaminationsSubjectRegionPage> pageBean = new PageBean<>();

        Integer pageno = 1;

        if(pageNo!=null && pageNo>0){
            pageno = pageNo;
        }
        int row = (pageno-1)*pageSize;
        pageBean.setData(service.find(page,row, pageSize));
        pageBean.setPageNo(pageno);
        pageBean.setPageSize(pageSize);
        pageBean.setTotal(service.findRowCount(page));
        return pageBean;
    }
}
