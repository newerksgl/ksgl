package com.newer.ksgl.model.controller;

import com.newer.ksgl.model.pojo.Subject;
import com.newer.ksgl.model.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/subject")
public class SubjectController {
    private String Image;
    @Autowired
    private SubjectService service;

    @ResponseBody
    @RequestMapping("/findAll")
    public List<Subject> findAll() {
        return service.findAll();
    }

    @ResponseBody
    @RequestMapping("/findById")
    public Subject findAll(Long id) {
        return service.findById(id);
    }

    @ResponseBody
    @PostMapping("/singlefile")
    public void singleFileUpload(MultipartFile file, HttpServletRequest request) {
        try {
            byte[] bytes = file.getBytes();
            Path path = Paths.get("ksgl/src/main/resources/static/image/", file.getOriginalFilename());
            //如果没有files文件夹，则创建
            if (!Files.isWritable(path)) {
                Files.createDirectories(Paths.get("ksgl/src/main/resources/static/image"));
            }
            //文件写入指定路径
            Files.write(path, bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image = file.getOriginalFilename();
    }

    @ResponseBody
    @RequestMapping("/add")
    public Integer add(HttpServletRequest request, @RequestParam("image") MultipartFile file) {
        try {
            byte[] bytes = file.getBytes();
            Path path = Paths.get("ksgl/src/main/resources/static/image", file.getOriginalFilename());
            //如果没有files文件夹，则创建
            if (!Files.isWritable(path)) {
                Files.createDirectories(Paths.get("ksgl/src/main/resources/static/image"));
            }
            //文件写入指定路径
            Files.write(path, bytes);

            Subject subject = new Subject();
            subject.setName(request.getParameter("name"));

            InetAddress address = InetAddress.getLocalHost();

            subject.setImage("http://"+address.getHostAddress()+":9999/image/"+file.getOriginalFilename());
            System.out.println(subject);
//            service.add(subject);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return 1;
    }

    @ResponseBody
    @RequestMapping("/del")
    public Integer del(Long id) {
        try {
            service.deleteById(id);
        } catch (Exception e) {
            return 0;
        }
        return 1;
    }

    @ResponseBody
    @RequestMapping("/update")
    public Integer update(Subject subject) {
        try {
            service.updateById(subject);
        } catch (Exception e) {
            return 0;
        }
        return 1;
    }
}