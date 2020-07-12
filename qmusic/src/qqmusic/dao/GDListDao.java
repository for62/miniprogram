package qqmusic.dao;

import org.springframework.stereotype.Component;
import qqmusic.entity.GDList;

import java.util.List;

@Component
public interface GDListDao {
    public List<GDList> getAll(String geshou);
}
