package com.example.springbootsessiondemo1.service.impl;

import cn.hutool.core.lang.UUID;
import com.example.springbootsessiondemo1.service.FileStorageService;
import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Service
public class FileStorageServiceImpl implements FileStorageService {



    // 获取配置属性中的文件存储路径
    @Value("${file.storage.path}")
    private String fileStoragePath;

    /**
     * 保存文件
     * @param file
     * @return
     */
    @Override
    public String saveFile(MultipartFile file) throws Exception{
//        // 获取原始文件名
//        String originalFileName = file.getOriginalFilename();
//        // 生成新的文件名，避免重复
//        String newFileName = UUID.fastUUID() + "." + getFileExtension(originalFileName);
//        // 创建目标文件对象
//        File destFile = new File(fileStoragePath + newFileName);
//        // 将上传的文件写入目标文件
//        FileUtils.copyInputStreamToFile(file.getInputStream(), destFile);
//        // 返回新的文件名
//        return newFileName;

        return null;
    }


    public static String getFileExtension(String fileName) {
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0) {
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        } else {
            return "";
        }
    }

}
