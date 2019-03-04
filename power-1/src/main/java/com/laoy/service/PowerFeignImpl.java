package com.laoy.service;


import com.laoy.util.R;
import org.springframework.stereotype.Component;

/**
 * @author yueyueyue
 * @date 2019/3/4 10:57
 * Description: laoy-cloud
 */

@Component
public class PowerFeignImpl implements PowerFeignService {

    @Override
    public Object getPower() {
        //return R.error("power服务暂时不可用");
        return R.success("测试方法");
    }
    @Override
    public Object getPowerList() {
        return R.error("getPowerList暂时不可用");
    }
}
