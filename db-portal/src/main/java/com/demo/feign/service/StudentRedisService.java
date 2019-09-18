package com.demo.feign.service;

import com.api.service.RedisService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author huangfu
 */
@FeignClient("db-redis-save")
public interface StudentRedisService extends RedisService {}
