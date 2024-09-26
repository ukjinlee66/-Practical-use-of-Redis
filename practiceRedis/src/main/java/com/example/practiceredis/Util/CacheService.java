package com.example.practiceredis.Util;

import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CacheService {

    private final RedisTemplate<String, String> redisTemplate;

    public void save(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public String get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    public void CacheWarmUp() {
        //TODO : Cache WarmUp
        // Cacheable 작업으로 인해 Cache와 데이터베이스의 부하가 급증하는 Thundering Herd 문제 방지를 위해
    }
}
