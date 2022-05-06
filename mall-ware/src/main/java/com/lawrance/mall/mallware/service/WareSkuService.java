package com.lawrance.mall.mallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lawrance.common.utils.PageUtils;
import com.lawrance.mall.mallware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author lawrance
 * @email lawrance@gmail.com
 * @date 2022-05-06 10:14:19
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

