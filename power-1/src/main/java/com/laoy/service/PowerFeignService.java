package com.laoy.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * description: laoy-cloud
 * @author yueyueyue
 * @date 2019/3/4 10:53
 *
 */
//,fallback = PowerFeignImpl.class
@FeignClient(name = "server-power" )
public interface PowerFeignService {

    @RequestMapping("/getPower.do")
    Object getPower();

    @RequestMapping("/getPowerLiset.do")
    Object getPowerList();
}
