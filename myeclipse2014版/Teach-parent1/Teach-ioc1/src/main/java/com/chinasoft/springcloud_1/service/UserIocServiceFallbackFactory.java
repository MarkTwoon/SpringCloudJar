package com.chinasoft.springcloud_1.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

@Component
public class UserIocServiceFallbackFactory implements FallbackFactory<UserIocService>{

	@Override
	public UserIocService create(Throwable arg0) {
		// TODO Auto-generated method stub
		return new UserIocService(){
   /*ORM线程 远程调用异常的  catch异常捕获执行*/
			@Override
			public List<Map<String, Object>> selectCityAll() {
				// TODO Auto-generated method stub
				Map<String,Object> map=new HashMap<String, Object>();
				map.put("mark", "ORM线程运行异常，远程调用数据传输失败");
				List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
				list.add(map);
				return list;
			}

			@Override
			public Map<String, Object> headNumber(Map<String, Object> map) {
				// TODO Auto-generated method stub
				Map<String,Object> map1=new HashMap<String, Object>();
				map1.put("mark", "ORM线程运行异常，远程调用数据传输失败");
				return map1;
			}

			@Override
			public Map<String, Object> selectCouponMainByCityId(
					Map<String, Object> map) {
				// TODO Auto-generated method stub
				Map<String,Object> map1=new HashMap<String, Object>();
				map1.put("mark", "ORM线程运行异常，远程调用数据传输失败");
				return map1;
			}

			@Override
			public List<Map<String, Object>> selectSuccessUserList(
					Map<String, Object> map) {
				// TODO Auto-generated method stub
				Map<String,Object> map1=new HashMap<String, Object>();
				map1.put("mark", "ORM线程运行异常，远程调用数据传输失败");
				List<Map<String,Object>> list=new ArrayList<Map<String,Object>>();
				list.add(map1);
				return list;
			}
			
		};
	}

	
	
}
