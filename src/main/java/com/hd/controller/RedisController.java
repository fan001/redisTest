package com.hd.controller;

import com.hd.entity.MyInfo;
import com.hd.service.MyRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BigFan
 * @create 2018/9/1 9:15 PM
 */
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    MyRedisService myRedisService;

    @RequestMapping("/add")
    public String addRedisValue(){
        myRedisService.addData();
        return "success";
    }


    @GetMapping("/put")
    public String putRedisValue(String name,String age,String description){
        MyInfo myInfo = new MyInfo(name,age,description);
        myRedisService.putValue(myInfo);
        return "asw";
    }
}
