package com.newer.ksgl.model.controller;

import com.newer.ksgl.model.pojo.Curriculumstypes;
import com.newer.ksgl.model.service.CurriculumstypesService;
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

    @ResponseBody
    @RequestMapping("/findAll")
    public List<Curriculumstypes> findAll(){
        return service.findAll();
    }

    @ResponseBody
    @RequestMapping("/findById")
    public Curriculumstypes findById(Long id){
        return service.findById(id);
    }

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
