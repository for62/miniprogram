package com.wx.filemanagersystem.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "file_system")
@Data
public class FileEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /*文件临时路径*/
    private String path;
    /*文件名称*/
    private String name;
    /*文件大小，以字节为单位*/
    private Integer size;
    /*文件类型*/
    /*image-1 viedo-2，file-3*/
    private Integer type;
    /*文件状态*/
    /*exist-1 删除进入云数据库-2，永久删除-3*/
    private Integer status;
}