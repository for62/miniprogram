package com.wx.filemanagersystem.util;

import com.alibaba.fastjson.JSONArray;
import com.wx.filemanagersystem.dto.FileDto;
import com.wx.filemanagersystem.entity.FileEntity;

import java.util.List;

/**
 * Json工具类
 */
public class JsonUtils {
    /**
     * 将Json字符串String tempFiles转为List<FileDto>
     *
     * @param tempFiles
     * @return
     */
    public static List<FileDto> getFileEntityList(String tempFiles) {
        JSONArray jsonArray = JSONArray.parseArray(tempFiles);
        List<FileDto> fileEntityList = jsonArray.toJavaList(FileDto.class);
        System.out.println(fileEntityList);
        return fileEntityList;
    }
}
