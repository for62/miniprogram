package com.wx.filemanagersystem.enums;

/**
 * image-1 viedo-2，file-3
 */
public enum EnumFileType {
    IMAGE(1, "image"),
    VIEDO(2, "video"),
    FILE(3, "file");

    private Integer code;
    private String desc;

    private EnumFileType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static String getEnumValue(Integer code) {
        for (EnumFileType enumFileStatus : EnumFileType.values()) {
            if (enumFileStatus.getCode().equals(code)) {
                return enumFileStatus.getDesc();
            }
        }
        return null;
    }

    public static Integer getEnumKey(String desc) {
        for (EnumFileType enumFileStatus : EnumFileType.values()) {
            if (enumFileStatus.getDesc().equals(desc)) {
                return enumFileStatus.getCode();
            }
        }
        return null;
    }

    public static EnumFileType getEnum(Integer code) {
        for (EnumFileType enumFileStatus : EnumFileType.values()) {
            if (enumFileStatus.getDesc().equals(code)) {
                return enumFileStatus;
            }
        }
        return null;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}
