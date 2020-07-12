package qqmusic.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import qqmusic.entity.Comment;
import qqmusic.entity.Playlist;
import qqmusic.service.CommentService;
import qqmusic.service.PlaylistService;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@Controller
@SessionAttributes("comments")
public class CommentHandler{

    @Autowired
    CommentService commentService;

    /**
     * 查询评论
     * @param geming
     * @param map
     * @return
     */
    @RequestMapping("/comment")
    @ResponseBody
    public void comment(@Param("geming") String geming, Map map){
        System.err.println("---"+geming);
        List<Comment> comments = commentService.getAll(geming);
        map.put("comments",comments);
    }

    @RequestMapping("/inscom")
    @ResponseBody
    public void inscom(@Param("pinglun") String pinglun,@Param("geming") String geming, Map map){
        System.err.println("---"+pinglun);
        Comment comment = new Comment();
        comment.setTime(new Timestamp(System.currentTimeMillis()));
        comment.setPinglun(pinglun);
        comment.setGeming(geming);
        comment.setPlren("你猜啊");
        commentService.insert(comment);
    }

}
