package com.lawrance.mall.mallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lawrance.common.utils.PageUtils;
import com.lawrance.mall.mallmember.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 会员收藏的商品
 *
 * @author lawrance
 * @email lawrance@gmail.com
 * @date 2022-05-06 10:06:10
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

