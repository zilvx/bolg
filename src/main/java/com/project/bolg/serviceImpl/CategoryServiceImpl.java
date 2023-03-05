package com.project.bolg.serviceImpl;

import com.project.bolg.pojo.Category;
import com.project.bolg.mapper.CategoryMapper;
import com.project.bolg.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 栏目表 服务实现类
 * </p>
 *
 * @author HappyWealthy
 * @since 2023-03-04
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
