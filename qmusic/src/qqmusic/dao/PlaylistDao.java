package qqmusic.dao;

import org.springframework.stereotype.Repository;
import qqmusic.entity.Playlist;

import java.util.List;
@Repository
public interface PlaylistDao {
    public List<Playlist> getAll(String type);

    public Playlist get(String geming);
}
