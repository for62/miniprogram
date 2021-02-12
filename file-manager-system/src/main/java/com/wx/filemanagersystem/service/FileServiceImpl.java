package com.wx.filemanagersystem.service;

import com.wx.filemanagersystem.entity.FileEntity;
import com.wx.filemanagersystem.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl {
    @Autowired
    private FileRepository fileRepository;

    /*批量保存文件*/
    public List<FileEntity> saveFiles(List<FileEntity> fileEntitys) {
        return fileRepository.saveAll(fileEntitys);
    }

    /*保存单个文件*/
    public FileEntity saveFile(FileEntity fileEntity) {
        return fileRepository.save(fileEntity);
    }
}
