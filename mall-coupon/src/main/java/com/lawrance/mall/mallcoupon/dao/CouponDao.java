package com.lawrance.mall.mallcoupon.dao;

import com.lawrance.mall.mallcoupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lawrance
 * @email lawrance@gmail.com
 * @date 2022-05-06 09:58:57
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
