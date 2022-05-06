package com.lawrance.mall.mallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lawrance.common.utils.PageUtils;
import com.lawrance.mall.mallcoupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author lawrance
 * @email lawrance@gmail.com
 * @date 2022-05-06 09:58:57
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

