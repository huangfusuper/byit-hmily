package com.demo.feign.service;

import com.api.service.StudentService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author huangfu
 */

@FeignClient("db-mysql-save")
public interface MySqlService extends StudentService {}
