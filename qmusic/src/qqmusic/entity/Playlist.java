package qqmusic.entity;

import org.springframework.stereotype.Component;

import java.sql.Date;

/**
 * 歌单实体
 */
@Component
public class Playlist {
    String geming; // 歌名
    String geshou; // 歌手
    Date time; // 时间
    String image; // 图片
    String type; // 类型

    public String getGeming() {
        return geming;
    }

    public void setGeming(String geming) {
        this.geming = geming;
    }

    public String getGeshou() {
        return geshou;
    }

    public void setGeshou(String geshou) {
        this.geshou = geshou;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
