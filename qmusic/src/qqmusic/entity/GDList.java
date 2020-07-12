package qqmusic.entity;

import org.springframework.stereotype.Repository;

/**
 * 歌单实体
 */
@Repository
public class GDList {
    Integer id;
    String geming;
    String geshou;
    String time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
