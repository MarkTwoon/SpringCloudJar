package com.chinasoft.springcloud_1.service;

import java.util.List;
import java.util.Map;

public interface UserService {
	public List<Map<String,Object>>  selectCityAll();
	public  Map<String,Object>   headNumber(Map<String,Object> map);
	public Map<String,Object>  selectCouponMainByCityId(Map<String,Object> map);
	public  List<Map<String,Object>>  selectSuccessUserList(Map<String,Object> map);
}
