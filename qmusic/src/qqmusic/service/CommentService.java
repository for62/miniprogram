package qqmusic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qqmusic.dao.CommentDao;
import qqmusic.dao.PlaylistDao;
import qqmusic.entity.Comment;
import qqmusic.entity.Playlist;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    CommentDao commentDao;

    /**
     * 插入评论
     */
    public void insert(Comment comment){
        commentDao.insert(comment);
    }

    /**
     * 显示评论
     * @param geshou
     * @return
     */
    public List<Comment> getAll(String geshou){
        return commentDao.getAll(geshou);
    }
}
