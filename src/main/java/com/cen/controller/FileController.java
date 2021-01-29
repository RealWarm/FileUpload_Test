package com.cen.controller;

import java.io.File;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/file")
public class FileController {
    
    @Resource(name="uploadPath")
    String uploadPath;
    
    @RequestMapping(value="/upload", method=RequestMethod.GET)
    public String fileupload() {
    	log.info("FileController :: public String fileupload() invoked!!!");
        return "/upload";
    }
    
    @RequestMapping(value="/upload", method=RequestMethod.POST)
    // public ModelAndView uploadForm(MultipartFile file, ModelAndView mv) {
    public String uploadForm(MultipartFile file, Model model) {
    	log.info("FileController :: public ModelAndView uploadForm(MultipartFile file, ModelAndView mv) invoked!!!");
        String fileName = file.getOriginalFilename();
        File target = new File(uploadPath, fileName);
        
        //경로 생성
        if ( ! new File(uploadPath).exists()) {
            new File(uploadPath).mkdirs();
        }
        //파일 복사
        try {
            FileCopyUtils.copy(file.getBytes(), target);
            model.addAttribute("file", file);
        } catch(Exception e) {
            e.printStackTrace();
            model.addAttribute("file", "error");
        }
        //View 위치 설정
        model.addAttribute("post/test_upload.basic");
        return "complete";
    }

}//end class
