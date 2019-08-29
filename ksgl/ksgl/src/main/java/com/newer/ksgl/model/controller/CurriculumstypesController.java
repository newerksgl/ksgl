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
import java.net.InetAddress;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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
    public Integer add(HttpServletRequest request, @RequestParam("image") MultipartFile file){
        try {
            byte[] bytes = file.getBytes();
            Path path = Paths.get("G:/myproject1/ksgl/ksgl/ksgl/src/main/resources/static/image", file.getOriginalFilename());
            //如果没有files文件夹，则创建
            if (!Files.isWritable(path)) {
                Files.createDirectories(Paths.get("G:/myproject1/ksgl/ksgl/ksgl/src/main/resources/static/image"));
            }
            //文件写入指定路径
            Files.write(path, bytes);

            Curriculumstypes curriculumstypes = new Curriculumstypes();
            curriculumstypes.setTitle(request.getParameter("title"));
            curriculumstypes.setAddress(request.getParameter("address"));
            curriculumstypes.setCtid(Long.parseLong(request.getParameter("ctid")));
            curriculumstypes.setIntroduce(request.getParameter("introduce"));
            InetAddress address = InetAddress.getLocalHost();
            curriculumstypes.setImage("http://"+address.getHostAddress()+":9999/image/"+file.getOriginalFilename());
            service.add(curriculumstypes);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        return 1;
    }
}
