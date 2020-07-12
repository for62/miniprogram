package qqmusic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qqmusic.dao.GDListDao;
import qqmusic.entity.GDList;

import java.util.List;

@Service
public class GDListService {
    @Autowired
    GDListDao gdListDao;

    public List<GDList> getAll(String geshou){
        return gdListDao.getAll(geshou);
    }
}
