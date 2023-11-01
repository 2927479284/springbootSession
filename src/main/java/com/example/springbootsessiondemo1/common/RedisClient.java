package com.example.springbootsessiondemo1.common;

import cn.hutool.json.JSONUtil;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * StringRedisTemplate 工具类 集合了一些基础写法
 * Redis
 */
@Component
public class RedisClient {

    private final StringRedisTemplate stringRedisTemplate;

    public RedisClient(StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
    }

    /**
     * redis添加一条信息 传入 key value(为任何类型 自动转String) 超时时间 超时时间单位(时 分 秒等)
     * @param key key
     * @param value value(为任何类型 自动转String)
     * @param time 超时时间
     * @param timeUnit 超时时间单位(时 分 秒等)
     */
    public void set(String key, Object value, Long time, TimeUnit timeUnit){
        stringRedisTemplate.opsForValue().set(key, JSONUtil.toJsonStr(value),time,timeUnit);
    }

    /**
     * 通过key&结果类型返回list<指定类>
     * @param key key
     * @param classType 指定类
     * @return list<指定类>
     * @param <T> 范型T
     */
    public <T> List<T> getList(String key, Class<T> classType){
        String s = stringRedisTemplate.opsForValue().get(key);
        return JSONUtil.toList(s,classType);
    }

    /**
     * 通过key&结果类型返回指定类
     * @param key key
     * @param classType 指定类型
     * @return 指定类
     * @param <T> 范型T
     */
    public<T> T get(String key,Class<T> classType){
        String s = stringRedisTemplate.opsForValue().get(key);
        return JSONUtil.toBean(s,classType);
    }

}
