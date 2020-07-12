package qqmusic.dao;

import org.springframework.stereotype.Repository;
import qqmusic.entity.Comment;

import java.util.List;

@Repository
public interface CommentDao {
    public void insert(Comment comment);

    public List<Comment> getAll(String geshou);
}
