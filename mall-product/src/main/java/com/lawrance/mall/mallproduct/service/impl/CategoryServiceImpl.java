package com.lawrance.mall.mallproduct.service.impl;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lawrance.common.utils.PageUtils;
import com.lawrance.common.utils.Query;

import com.lawrance.mall.mallproduct.dao.CategoryDao;
import com.lawrance.mall.mallproduct.entity.CategoryEntity;
import com.lawrance.mall.mallproduct.service.CategoryService;

import javax.annotation.Resource;

import static org.apache.ibatis.ognl.DynamicSubscript.all;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Resource
    CategoryDao category;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> categoryEntities = category.selectList(null);

        List<CategoryEntity> levelOne = categoryEntities.stream().filter(e -> e.getParentCid() == 0)
                .peek(e -> e.setChildren(getChildren(e, categoryEntities)))
                .sorted(Comparator.comparingInt(o -> Optional.ofNullable(o.getSort()).orElse(0)))
                .collect(Collectors.toList());

        return levelOne;
    }

    private List<CategoryEntity> getChildren(CategoryEntity parent, List<CategoryEntity> allList) {
        return allList.stream().filter(e -> e.getParentCid().equals(parent.getCatId()))
                .peek(e2 -> e2.setChildren(getChildren(e2, allList)))
                .sorted(Comparator.comparingInt(o -> Optional.ofNullable(o.getSort()).orElse(0)))
                .collect(Collectors.toList());
    }


    @Override
    public void removeMenuByIds(List<Long> singletonList) {

        category.deleteBatchIds(singletonList);
    }
}
