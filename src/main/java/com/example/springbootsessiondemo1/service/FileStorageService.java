package com.example.springbootsessiondemo1.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileStorageService {

    public String saveFile(MultipartFile file) throws Exception;
}
