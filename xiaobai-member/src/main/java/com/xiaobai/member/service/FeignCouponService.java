package com.xiaobai.member.service;

import com.xiaobai.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author cxkan
 */
@Component
@FeignClient(value = "xiaobai-coupon",fallback = fallbackCouponService.class)
public interface FeignCouponService {
    @GetMapping("/member/list")
    public R membercoupons();

}
