package com.wx.filemanagersystem.controller;

import com.wx.filemanagersystem.base.BaseController;
import com.wx.filemanagersystem.entity.FileEntity;
import com.wx.filemanagersystem.service.FileServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/file")
@RestController
public class FileController extends BaseController {
    @Autowired
    private FileServiceImpl fileService;

    @RequestMapping("save-file.json")
    public List<FileEntity> saveFile(List<FileEntity> tempFiles) {
        return fileService.saveFiles(tempFiles);
    }

}
