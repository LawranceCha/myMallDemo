package com.lawrance.mall.mallmember.dao;

import com.lawrance.mall.mallmember.entity.GrowthChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 成长值变化历史记录
 * 
 * @author lawrance
 * @email lawrance@gmail.com
 * @date 2022-05-06 10:06:10
 */
@Mapper
public interface GrowthChangeHistoryDao extends BaseMapper<GrowthChangeHistoryEntity> {
	
}
