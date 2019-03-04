package com.laoy.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * description: laoy-cloud
 * @author yueyueyue
 * @date 2019/3/4 10:53
 *
 */


@FeignClient(name = "server-power" ,fallback = PowerFeignFalBackImpl.class)
public interface PowerFeignService {
    /**
     * //name = "server-power"  服务名称,  fallback = PowerFeignFalBackImpl.class 回退的方法,或者说是熔断之后 调用此类里的方法返回
     * @return
     */
    @RequestMapping("/getPower.do")
    Object getPower();

    @RequestMapping("/getPowerLiset.do")
    Object getPowerList();
}
