package com.lawrance.mall.mallware.dao;

import com.lawrance.mall.mallware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购单
 * 
 * @author lawrance
 * @email lawrance@gmail.com
 * @date 2022-05-06 10:14:19
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
