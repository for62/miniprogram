package com.wx.filemanagersystem.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
public class FileDto {

    /*文件临时路径*/
    private String path;
    /*文件名称*/
    private String name;
    /*文件大小，以字节为单位*/
    private Integer size;
    /*文件类型*/
    /*image-1 viedo-2，file-3*/
    private String type;
    /*文件状态*/
    /*exist-1 删除进入云数据库-2，永久删除-3*/
    private String status;
}
