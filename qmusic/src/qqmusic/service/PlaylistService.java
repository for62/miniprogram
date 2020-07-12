package qqmusic.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import qqmusic.dao.PlaylistDao;
import qqmusic.entity.Playlist;

import java.util.List;

@Service
public class PlaylistService {

    @Autowired
    PlaylistDao playlistDao;

    /**
     * 查询出歌单
     * @param type 参数：类型
     * @return
     */
    public List<Playlist> getAll(String type){
        return playlistDao.getAll(type);
    }

    public Playlist get(String geming){
        return playlistDao.get(geming);
    }
}
