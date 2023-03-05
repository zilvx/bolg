package com.project.bolg.mapper;

import com.project.bolg.pojo.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 文章表 Mapper 接口
 * </p>
 *
 * @author HappyWealthy
 * @since 2023-03-04
 */
@Mapper
public interface ArticleMapper extends BaseMapper<Article> {

}
