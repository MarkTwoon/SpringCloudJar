package com.chinasoft.springcloud_1.service;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="Teach-orm1", fallbackFactory=UserIocServiceFallbackFactory.class)
public interface UserIocService {
  
@RequestMapping(value="/selectCityAll",method=RequestMethod.GET)
public List<Map<String,Object>>  selectCityAll();

@RequestMapping(value="/headNumber")
public  Map<String,Object>   headNumber(Map<String,Object> map);

@RequestMapping(value="/selectCouponMainByCityId")
public Map<String,Object>  selectCouponMainByCityId(Map<String,Object> map);

@RequestMapping(value="/selectSuccessUserList")
public  List<Map<String,Object>>  selectSuccessUserList(Map<String,Object> map);
}
