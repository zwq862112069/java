package com.zwq.service;

import com.zwq.pojo.Article;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ArticleService {
    public Page<Article> selectArticle(int pageNum, int pageSize);
}
