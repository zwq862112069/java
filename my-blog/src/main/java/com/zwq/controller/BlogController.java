package com.zwq.controller;

import com.zwq.pojo.Article;
import com.zwq.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class BlogController {
    @Autowired
    private ArticleService articleService;
    @RequestMapping("/blogIndex")
    public String blogIndex(ModelMap modelMap, @RequestParam(value = "pageNum",defaultValue = "0")int pageNum,@RequestParam(value = "pageSize",defaultValue = "2")int pageSize){
        Page<Article> articles = articleService.selectArticle(pageNum, pageSize);
        modelMap.put("page",articles);
        return "client/index";
    }

}
