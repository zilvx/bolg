package com.project.bolg.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 栏目表
 * </p>
 *
 * @author HappyWealthy
 * @since 2023-03-04
 */
@Getter
@Setter
@TableName("category")
@ApiModel(value = "Category对象", description = "栏目表")
public class Category extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("标题")
    @TableField("title")
    private String title;


}
