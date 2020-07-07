/**
 * @Description
 * @author StillVanTessi
 * @create 2020-07-05     17:50
 * @projectname spring-boot-batis
 * @package com.lt.springboot.springbootbatis.controller
 * @filename null.java
 * @idea IntelliJ IDEA
 */


package com.lt.springboot.springbootbatis.controller;

import com.lt.springboot.springbootbatis.mapper.NewsMapper;
import com.lt.springboot.springbootbatis.pojo.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController {

    @Autowired
    NewsMapper newsMapper;

    @RequestMapping("/news")
    public String getNews(){
        try{
           List<News> news = newsMapper.selectByExample(null);
           String re = "<hr><br><h1>News</h1>";
            for (News n:news) {
                re +="<br><hr>"+n.toString();
            }
            re +="<br><hr>";
            return re;
        }
        catch (Exception e){
            return "News ERROR!";
        }
    }
}
