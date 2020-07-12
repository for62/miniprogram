package qqmusic.entity;

import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * 评论实体
 */
@Repository
public class Comment {
    Integer id;
    String geming;
    String pinglun;
    String plren;
    Timestamp time;

    public String getPlren() {
        return plren;
    }

    public void setPlren(String plren) {
        this.plren = plren;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

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

    public String getPinglun() {
        return pinglun;
    }

    public void setPinglun(String pinglun) {
        this.pinglun = pinglun;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", geming='" + geming + '\'' +
                ", pinglun='" + pinglun + '\'' +
                ", plren='" + plren + '\'' +
                ", time=" + time +
                '}';
    }
}
