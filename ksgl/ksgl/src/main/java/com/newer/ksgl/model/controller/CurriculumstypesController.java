package com.newer.ksgl.model.controller;

import com.newer.ksgl.model.pojo.Curriculumstypes;
import com.newer.ksgl.model.service.CurriculumstypesService;
import com.newer.ksgl.model.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/curriculumstypes")
public class CurriculumstypesController {
    @Autowired
    private CurriculumstypesService service;

    //查询所有数据入口
    @ResponseBody
    @RequestMapping("/findAll")
    public List<Curriculumstypes> findAll(){
        return service.findAll();
    }

    //多样查询数据分页入口
    @ResponseBody
    @RequestMapping("/find")
    public PageBean<Curriculumstypes> find( Curriculumstypes c, Integer pageNo){
        Integer pageSize = 1;
        String tableName = "Curriculumstypes";

        PageBean<Curriculumstypes> pageBean = new PageBean<>();

        Integer pageno = 1;

        if(pageNo!=null && pageNo>0){
            pageno = pageNo;
        }
        int row = (pageno-1)*pageSize;
        pageBean.setData(service.find(c,row, pageSize));
        pageBean.setPageNo(pageno);
        pageBean.setPageSize(pageSize);
        pageBean.setTotal(service.findRowCount(c));
        return pageBean;
    }

    //根据id查询数据入口
    @ResponseBody
    @RequestMapping("/findById")
    public Curriculumstypes findById(Long id){
        return service.getCurriculumstypesById(id);
    }

    //根据id删除数据入口
    @ResponseBody
    @RequestMapping("/del")
    public Integer del(Long id){
        try {
            service.deleteById(id);
        }catch (Exception e){
            return 0;
        }
        return 1;
    }

    //添加数据入口
    @ResponseBody
    @RequestMapping("/add")
    public Integer add(HttpServletRequest request,@RequestParam("image") MultipartFile file){
        String fname = new Date().getTime()+file.getOriginalFilename();
        String url = request.getSession().getServletContext().getRealPath("/upload");
        File newFile = new File(url);
        if(!newFile.exists()){
            newFile.mkdir();
        }
        newFile = new File(url,fname);
        try {
            file.transferTo(newFile);
            Curriculumstypes curriculumstypes = new Curriculumstypes();
            curriculumstypes.setCtid(Long.parseLong(request.getParameter("ctid")));
            curriculumstypes.setAddress(request.getParameter("address"));
            curriculumstypes.setTitle(request.getParameter("title"));
            curriculumstypes.setIntroduce(request.getParameter("introduce"));
            curriculumstypes.setImage(fname);
            service.add(curriculumstypes);
        }catch (Exception e){
            return 0;
        }
        return 1;
    }
}
