package com.wx.filemanagersystem.controller;

import com.wx.filemanagersystem.base.BaseController;
import com.wx.filemanagersystem.dto.FileDto;
import com.wx.filemanagersystem.entity.FileEntity;
import com.wx.filemanagersystem.enums.EnumFileType;
import com.wx.filemanagersystem.service.FileService;
import com.wx.filemanagersystem.util.JsonUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/file")
@RestController
public class FileController extends BaseController {
    @Autowired
    private FileService fileService;

    @RequestMapping("/save-file.json")
    public List<FileEntity> saveFile(String tempFiles) throws Exception {
        logger.info(tempFiles);
        if (StringUtils.isNotBlank(tempFiles)) {
            return fileService.saveFiles(JsonUtils.getFileEntityList(tempFiles));
        } else {
            throw new Exception("参数不合法！");
        }
    }

    @RequestMapping("/show-file.json")
    public List<FileDto> showFile(String keyWord, String type) throws Exception {
        logger.info(keyWord + "<--->" + type);
        if (StringUtils.isNotBlank(keyWord)) {
            List<FileDto> fileDtoList = fileService.showFilesByKeyWordAndType(keyWord, EnumFileType.getEnumKey(type));
            System.out.println(fileDtoList);
            return fileDtoList;
        } else {
            List<FileDto> fileDtoList = fileService.showFilesByType(EnumFileType.getEnumKey(type));
            System.out.println(fileDtoList);
            return fileDtoList;
        }
    }
}
