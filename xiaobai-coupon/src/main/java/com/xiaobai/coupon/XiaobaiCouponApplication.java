package com.xiaobai.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class XiaobaiCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaobaiCouponApplication.class, args);
    }

}
