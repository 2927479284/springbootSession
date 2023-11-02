package com.example.springbootsessiondemo1.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * 上传文件控制层
 */
@RestController
@RequestMapping("/upload/")
public class FileUploadController {


    @Value("${file.storage.path}")
    private String fileStoragePath;

    @PostMapping("image")
    public String upload(MultipartFile file, HttpSession session, HttpServletRequest request) throws IOException {
        if (file.isEmpty()) {
            return "文件为空，请选择一个文件上传";
        }

        try {
            // 指定存储文件的目录，这里随意指定一个路径
            String uploadDirectory = fileStoragePath;

            String originalFilename = file.getOriginalFilename();
            if (originalFilename.endsWith(".pdf")){
            }
            // 获取文件名
            String fileName = file.getOriginalFilename();

            // 构建文件保存路径
            String filePath = uploadDirectory + fileName;

            // 保存文件到指定路径
            file.transferTo(new File(filePath));

            // 返回文件的URL地址
            String fileUrl = request.getScheme() + "://" + request.getServerName() + request.getServerPort() + "/uploads/" + fileName; // 修改为您的域名

            return "文件上传成功，文件URL地址：" + fileUrl;
        } catch (IOException e) {
            return "文件上传失败: " + e.getMessage();
        }
    }
}
