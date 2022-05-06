package com.lawrance.mall.mallorder.dao;

import com.lawrance.mall.mallorder.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author lawrance
 * @email lawrance@gmail.com
 * @date 2022-05-06 10:12:50
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
