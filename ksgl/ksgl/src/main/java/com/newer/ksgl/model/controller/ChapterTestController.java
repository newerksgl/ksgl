package com.newer.ksgl.model.controller;

import com.newer.ksgl.model.service.ChapterTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/chaptertest")
public class ChapterTestController {
    @Autowired
    private ChapterTestService service;
}
