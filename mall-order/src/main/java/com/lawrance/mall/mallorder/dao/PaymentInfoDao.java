package com.lawrance.mall.mallorder.dao;

import com.lawrance.mall.mallorder.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author lawrance
 * @email lawrance@gmail.com
 * @date 2022-05-06 10:12:50
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
