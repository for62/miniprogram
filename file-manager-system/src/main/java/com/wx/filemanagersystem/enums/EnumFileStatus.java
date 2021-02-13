package com.wx.filemanagersystem.enums;

/**
 * exist-1 删除进入云数据库-2，永久删除-3
 */
public enum EnumFileStatus {
    IMAGE(1, "exist"),
    VIEDO(2, "cloud"),
    FILE(3, "delete");

    private Integer code;
    private String desc;

    private EnumFileStatus(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static String getEnumValue(Integer code) {
        for (EnumFileStatus enumFileStatus : EnumFileStatus.values()) {
            if (enumFileStatus.getCode().equals(code)) {
                return enumFileStatus.getDesc();
            }
        }
        return null;
    }

    public static Integer getEnumKey(String desc) {
        for (EnumFileStatus enumFileStatus : EnumFileStatus.values()) {
            if (enumFileStatus.getDesc().equals(desc)) {
                return enumFileStatus.getCode();
            }
        }
        return null;
    }

    public static EnumFileStatus getEnum(Integer code) {
        for (EnumFileStatus enumFileStatus : EnumFileStatus.values()) {
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
