package com.lawrance.mall.mallproduct.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;


import javax.annotation.Resource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lawrance.mall.mallproduct.entity.CategoryEntity;
import com.lawrance.mall.mallproduct.service.CategoryService;
import com.lawrance.common.utils.PageUtils;
import com.lawrance.common.utils.R;



/**
 * 商品三级分类
 *
 * @author lawrance
 * @email lawrance@gmail.com
 * @date 2022-05-05 22:25:53
 */
@RestController
@RequestMapping("mallproduct/category")
public class CategoryController {
    @Resource
    private CategoryService categoryService;

    /**
     * 列表
     */
    @RequestMapping("/listWithTree")
    //@RequiresPermissions("mallproduct:category:list")
    public R listWithTree(){
        List<CategoryEntity> listWithTree = categoryService.listWithTree();

        return R.ok().put("listWithTree", listWithTree);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("mallproduct:category:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = categoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{catId}")
    //@RequiresPermissions("mallproduct:category:info")
    public R info(@PathVariable("catId") Long catId){
		CategoryEntity category = categoryService.getById(catId);

        return R.ok().put("category", category);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("mallproduct:category:save")
    public R save(@RequestBody CategoryEntity category){
		categoryService.save(category);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("mallproduct:category:update")
    public R update(@RequestBody CategoryEntity category){
		categoryService.updateById(category);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("mallproduct:category:delete")
    public R delete(@RequestBody List<Long> catIds){
		categoryService.removeMenuByIds(catIds);

        return R.ok();
    }

}
