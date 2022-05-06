package com.lawrance.mall.mallmember.feign;

import com.lawrance.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 描述 : 声明式远程调用接口
 *
 * @author : zj
 * @version : 1.0
 * @date : Created in 2022/5/6 11:12
 */
@FeignClient("malldemo-coupon")
public interface ICouponFeignService {

    @RequestMapping("/mallcoupon/coupon/memberCoupon/list")
    public R memberCoupons();
}
