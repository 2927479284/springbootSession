package com.example.springbootsessiondemo1.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * 上传文件控制层
 */
@RestController
@RequestMapping("upload/")
public class FileUploadController {

    @PostMapping("image")
    public String upload(MultipartFile file, HttpSession session) throws IOException {
//        //获取上传文件用户id
////        User user = (User) session.getAttribute("user");
//        //获取文件原始名称
//        String oldFileName = file.getOriginalFilename();
//        //获取文件后缀
//        String extension = "." + FilenameUtils.getExtension(file.getOriginalFilename());
//        //生成新的文件名称
//        String newFileName = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + UUID.randomUUID().toString().replace("-", "") + extension;
//        //文件大小
//        Long size = file.getSize();
//        //文件类型
//        String type = file.getContentType();
//        //处理根据日期生成目录
//        //String realPath = ResourceUtils.getURL("classpath:").getPath() + "/static/files";
//        String dateFormat = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
//        String dateDirPath = uploadPath + "/files/" + dateFormat;
//        File dateDir = new File(dateDirPath);
//        if (!dateDir.exists()) dateDir.mkdirs();
//        //处理文件上传
//        file.transferTo(new File(dateDir, newFileName));
//        //将文件信息放入数据库保存
//        UserFile userFile = new UserFile();
//        userFile.setOldFileName(oldFileName).setNewFileName(newFileName).setExt(extension).setSize(String.valueOf(size))
//                .setType(type).setPath("/files/" + dateFormat).setUserId(user.getId());
//        userFileService.save(userFile);
        return "redirect:/file/showAll";
    }
}
