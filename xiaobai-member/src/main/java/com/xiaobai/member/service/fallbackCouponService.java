package com.xiaobai.member.service;

import com.xiaobai.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@Component
public class fallbackCouponService implements FeignCouponService {
    @Override
    public R membercoupons() {
        return R.error("访问失败");
    }
}
