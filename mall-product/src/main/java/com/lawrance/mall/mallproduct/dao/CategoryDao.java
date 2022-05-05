package com.lawrance.mall.mallproduct.dao;

import com.lawrance.mall.mallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author lawrance
 * @email lawrance@gmail.com
 * @date 2022-05-05 22:25:53
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
