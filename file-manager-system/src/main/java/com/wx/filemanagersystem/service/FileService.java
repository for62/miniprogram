package com.wx.filemanagersystem.service;

import com.wx.filemanagersystem.dto.FileDto;
import com.wx.filemanagersystem.entity.FileEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FileService {
    /*批量保存文件*/
    List<FileEntity> saveFiles(List<FileDto> fileDtoList);

    /*保存单个文件*/
    FileEntity saveFile(FileDto fileDto);

    /*查询文件*/
    List<FileDto> showFilesByKeyWordAndType(String keyWord, Integer type);

    /*查询文件*/
    List<FileDto> showFilesByType(Integer type);
}
