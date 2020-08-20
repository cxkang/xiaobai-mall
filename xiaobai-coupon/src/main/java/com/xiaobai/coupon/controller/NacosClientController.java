package com.xiaobai.coupon.controller;

import com.xiaobai.common.utils.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope//支持动态刷新
@RestController
public class NacosClientController {
//
@Value("${config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        return configInfo;
    }

    @GetMapping("/member/list")
    public R membercoupons(){

      return R.ok().put("coupons","满一百送一百");

    }


}