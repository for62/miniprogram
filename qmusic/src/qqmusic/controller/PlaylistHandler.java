package qqmusic.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;
import net.sf.json.JSON;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import qqmusic.entity.Playlist;
import qqmusic.service.PlaylistService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Controller
@SessionAttributes("playlists")
public class PlaylistHandler {

    @Autowired
    PlaylistService playlistService;

    @RequestMapping("/display")
    public String display(Map map){
        return "show";
    }

    @RequestMapping("/show")
    @ResponseBody
    public void show(@RequestParam(defaultValue = "内地") String type, Map map){
        System.err.println(type+"---");
        List<Playlist> playlists = playlistService.getAll(type);
        System.err.println(playlists);
        map.put("playlists",playlists);
    }

    @RequestMapping("/detail")
    public String detail(@Param("geming") String geming, Map map){
        System.err.println(geming+"---");
        Playlist playlist = playlistService.get(geming);
        System.err.println(playlist);
        map.put("playlist",playlist);
        return "detail";
    }

}
