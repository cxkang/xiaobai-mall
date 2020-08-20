package com.xiaobai.xiaobaiorder.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.xiaobai.common.utils.R;
import com.xiaobai.xiaobaiorder.myhandler.CustomerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/order")
public class OrderController {
    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handleException")
    public R byResource() {
        return  R.ok();
    }

    public R handleException(BlockException exception) {
        return  R.error(444,exception.getClass().getCanonicalName() + "\t 服务不可用");
    }


}
