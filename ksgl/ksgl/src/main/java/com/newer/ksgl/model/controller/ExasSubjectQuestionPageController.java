package com.newer.ksgl.model.controller;

import com.newer.ksgl.model.pojo.Question;
import com.newer.ksgl.model.pojo.Subject;
import com.newer.ksgl.model.pojo.pojopage.ExasSubjectQuestionPage;
import com.newer.ksgl.model.service.ExasSubjectQuestionPageService;
import com.newer.ksgl.model.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/exasSubjectQuestion")
public class ExasSubjectQuestionPageController {
    @Autowired
    private ExasSubjectQuestionPageService service;

    @ResponseBody
    @RequestMapping("/find")
    public PageBean<ExasSubjectQuestionPage> find(HttpServletRequest request,ExasSubjectQuestionPage page, Integer pageNo){
        Integer pageSize = 30;
        PageBean<ExasSubjectQuestionPage> pageBean = new PageBean<>();
        page=new ExasSubjectQuestionPage();
        Integer pageno = 1;
        Subject s = new Subject();
        s.setName(request.getParameter("name"));
        Question q = new Question();
        q.setQuestion(request.getParameter("question"));
        q.setQuestionTest(request.getParameter("questiontest"));
        page.setS(s);
        page.setQ(q);
        page.setReference(request.getParameter("reference"));
        page.setDifficulty(request.getParameter("difficulty"));
        page.setQuestionStem(request.getParameter("questionstem"));
        page.setProblem(request.getParameter("problem"));
        page.setDate(request.getParameter("date"));
        try {
            page.setSid(Long.valueOf(request.getParameter("sid")));
        }catch (NumberFormatException e){}
        try {
            page.setQid(Long.valueOf(request.getParameter("qid")));
        }catch (NumberFormatException e){}
        try {
            page.setEid(Long.valueOf(request.getParameter("eid")));
        }catch (NumberFormatException e){}
        if(pageNo!=null && pageNo>0){
            pageno = pageNo;
        }
        int row = (pageno-1)*pageSize;
        pageBean.setData(service.find(page,row,pageSize));
        pageBean.setPageNo(pageno);
        pageBean.setPageSize(pageSize);
        pageBean.setTotal(service.findRowCount(page));
        return pageBean;
    }
}
