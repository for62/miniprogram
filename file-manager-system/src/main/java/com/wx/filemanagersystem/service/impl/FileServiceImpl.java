package com.wx.filemanagersystem.service.impl;

import com.google.common.collect.Lists;
import com.wx.filemanagersystem.consts.NumberConst;
import com.wx.filemanagersystem.dto.FileDto;
import com.wx.filemanagersystem.entity.FileEntity;
import com.wx.filemanagersystem.enums.EnumFileStatus;
import com.wx.filemanagersystem.enums.EnumFileType;
import com.wx.filemanagersystem.repository.FileRepository;
import com.wx.filemanagersystem.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {
    @Autowired
    private FileRepository fileRepository;

    /*批量保存文件*/
    public List<FileEntity> saveFiles(List<FileDto> fileDtoList) {
        return fileRepository.saveAll(convertDtoList2EntityList(fileDtoList));
    }

    /*保存单个文件*/
    public FileEntity saveFile(FileDto fileDto) {
        return fileRepository.save(convertDto2Entity(fileDto));
    }

    /*查询文件*/
    public List<FileDto> showFilesByKeyWordAndType(String keyWord, Integer type) {
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher("name", ExampleMatcher.GenericPropertyMatchers.contains())
                .withMatcher("type", ExampleMatcher.GenericPropertyMatchers.exact());
        FileEntity fileEntity = new FileEntity();
        fileEntity.setName(keyWord);
        fileEntity.setType(type);
        fileEntity.setStatus(NumberConst.ONE);
        Example<FileEntity> example = Example.of(fileEntity, matcher);
        Pageable pageable = PageRequest.of(NumberConst.ZERO, NumberConst.TEN);
        Page<FileEntity> fileEntitieList = fileRepository.findAll(example, pageable);
        return convertEntityList2DtoList(fileEntitieList.toList());
    }

    /*查询文件*/
    public List<FileDto> showFilesByType(Integer type) {
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withMatcher("type", ExampleMatcher.GenericPropertyMatchers.exact());
        FileEntity fileEntity = new FileEntity();
        fileEntity.setType(type);
        fileEntity.setStatus(NumberConst.ONE);
        Example<FileEntity> example = Example.of(fileEntity, matcher);
        Pageable pageable = PageRequest.of(NumberConst.ZERO, NumberConst.TEN);
        Page<FileEntity> fileEntitieList = fileRepository.findAll(example, pageable);
        return convertEntityList2DtoList(fileEntitieList.toList());
    }

    private List<FileEntity> convertDtoList2EntityList(List<FileDto> dtoList) {
        return Lists.transform(dtoList, new com.google.common.base.Function<FileDto, FileEntity>() {
            @Override
            public FileEntity apply(FileDto fileDto) {
                return convertDto2Entity(fileDto);
            }
        });
    }

    private List<FileDto> convertEntityList2DtoList(List<FileEntity> entityList) {
        return Lists.transform(entityList, new com.google.common.base.Function<FileEntity, FileDto>() {
            @Override
            public FileDto apply(FileEntity fileEntity) {
                return convertEntity2Dto(fileEntity);
            }
        });
    }

    private FileEntity convertDto2Entity(FileDto fileDto) {
        FileEntity fileEntity = new FileEntity();
        if (fileDto == null) {
            return fileEntity;
        }
        fileEntity.setPath(fileDto.getPath());
        fileEntity.setName(fileDto.getName());
        fileEntity.setSize(fileDto.getSize());
        Integer enumStatusKey = EnumFileStatus.getEnumKey(fileDto.getStatus());
        Integer status = enumStatusKey == null ? 1 : enumStatusKey;
        fileEntity.setStatus(status);
        fileEntity.setType(EnumFileType.getEnumKey(fileDto.getType()));
        return fileEntity;
    }

    private FileDto convertEntity2Dto(FileEntity fileEntity) {
        FileDto fileDto = new FileDto();
        if (fileEntity == null) {
            return fileDto;
        }
        fileDto.setPath(fileEntity.getPath());
        fileDto.setName(fileEntity.getName());
        fileDto.setSize(fileEntity.getSize());
        fileDto.setStatus(EnumFileStatus.getEnumValue(fileEntity.getStatus()));
        fileDto.setType(EnumFileType.getEnumValue(fileEntity.getType()));
        return fileDto;
    }
}
