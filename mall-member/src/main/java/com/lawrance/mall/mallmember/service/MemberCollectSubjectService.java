package com.lawrance.mall.mallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lawrance.common.utils.PageUtils;
import com.lawrance.mall.mallmember.entity.MemberCollectSubjectEntity;

import java.util.Map;

/**
 * 会员收藏的专题活动
 *
 * @author lawrance
 * @email lawrance@gmail.com
 * @date 2022-05-06 10:06:10
 */
public interface MemberCollectSubjectService extends IService<MemberCollectSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

