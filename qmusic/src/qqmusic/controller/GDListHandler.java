package qqmusic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import qqmusic.entity.GDList;
import qqmusic.service.GDListService;

import java.util.List;
import java.util.Map;

@Controller
@SessionAttributes("gdlist")
public class GDListHandler {

    @Autowired
    GDListService gdListService;

    @RequestMapping("getlist")
    @ResponseBody
    public void getList(String geshou, Map map){
        List<GDList> gdlist =  gdListService.getAll(geshou);
        System.err.println(gdlist+"好了~");
        map.put("gdlist",gdlist);
    }
}
