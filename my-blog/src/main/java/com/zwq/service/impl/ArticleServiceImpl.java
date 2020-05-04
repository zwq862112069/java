package com.zwq.service.impl;

import com.zwq.pojo.Article;
import com.zwq.repository.ArticleRepository;
import com.zwq.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;



    @Override
    public Page<Article> selectArticle(int pageNum, int pageSize) {
        PageRequest of = PageRequest.of(pageNum, pageSize);
        Page<Article> all = articleRepository.findAll(null, of);
        return all;
    }
}
