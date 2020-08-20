package com.xiaobai.member.controller;

import com.xiaobai.common.utils.R;
import com.xiaobai.member.service.FeignCouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.zip.CheckedOutputStream;

@RestController
@RequestMapping("/member")
public class feignMemberiController {
    @Resource
   private FeignCouponService feignCouponService;

    @RequestMapping("/coupons")
    public R test(){
        String name="zs";
        R r = feignCouponService.membercoupons();
        return  r;
    }


}
