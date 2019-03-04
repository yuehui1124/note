package com.laoy.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class PowerController {

    @RequestMapping("/getPower.do")
    public Map getPower(){
        HashMap map = new HashMap(6);
        map.put("nicai","wobucai");
        return  map;
    }
}
