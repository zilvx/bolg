package com.project.bolg.serviceImpl;

import com.project.bolg.pojo.Article;
import com.project.bolg.mapper.ArticleMapper;
import com.project.bolg.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章表 服务实现类
 * </p>
 *
 * @author HappyWealthy
 * @since 2023-03-04
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}
