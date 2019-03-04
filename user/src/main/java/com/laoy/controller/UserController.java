package com.laoy.controller;


import com.laoy.service.PowerFeignService;
import com.laoy.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    private PowerFeignService powerFeignService;
//
    //public void setPowerFeignService(PowerFeignService powerFeignService) {
    //    this.powerFeignService = powerFeignService;
    //}


    private static final String POWER ="http://SERVER-POWER";

    @RequestMapping("/getUser.do")
    public R getUser(){
        Map<String,Object> map = new HashMap<>();
        map.put("key","user");

        return R.success("返回成功",map);
    }


    //@RequestMapping("/getPower.do")
    //public R getPower(){
    //    return R.success("操作成功",restTemplate.getForObject("http://localhost:80/getPower.do",Object.class));
    //}

    /**
     * 测试接口
     * @return
     */
    @RequestMapping("/getFeignPower.do")
    public R getFeignPower(){
        return R.success("操作成功",powerFeignService.getPower()) ;

    }

}
