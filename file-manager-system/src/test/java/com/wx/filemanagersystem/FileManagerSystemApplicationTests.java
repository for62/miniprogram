package com.wx.filemanagersystem;

import com.wx.filemanagersystem.service.FileService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FileManagerSystemApplicationTests {

    @Autowired
    private FileService fileService;

    @Test
    void contextLoads() {
        System.out.println(fileService.showFilesByType(1));
    }

}
