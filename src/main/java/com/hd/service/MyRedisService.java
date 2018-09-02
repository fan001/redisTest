package com.hd.service;

import com.hd.entity.MyInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * @author BigFan
 * @create 2018/9/1 9:16 PM
 */
@Service
public class MyRedisService {

    @Autowired
    RedisTemplate redisTemplate;


    public void addData(){
        MyInfo myInfo = new MyInfo("11","22","s344");
        redisTemplate.opsForValue().set("11",myInfo);
        redisTemplate.opsForValue().set("myse","mys");
    }

    @CachePut(value = "MYCACHETEST",key = "'MYCACHETEST_'.concat(#result.name)")
    public MyInfo putValue(MyInfo myInfo){
        return myInfo;
    }

}
