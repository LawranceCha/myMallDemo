package com.lawrance.mall.mallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lawrance.common.utils.PageUtils;
import com.lawrance.mall.mallorder.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author lawrance
 * @email lawrance@gmail.com
 * @date 2022-05-06 10:12:50
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

