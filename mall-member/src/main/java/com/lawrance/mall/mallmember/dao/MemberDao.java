package com.lawrance.mall.mallmember.dao;

import com.lawrance.mall.mallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lawrance
 * @email lawrance@gmail.com
 * @date 2022-05-06 10:06:10
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
