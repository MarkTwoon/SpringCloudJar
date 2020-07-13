package com.chinasoft.springcloud_1.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinasoft.springcloud_1.service.UserIocService;
import com.chinasoft.springcloud_1.util.RequestUtil;
 
 
 
 
 
@Controller  
public class UserController {
  @Autowired
  private UserIocService userService;
	
  /*IOC的第一个 异步接口 控制器*/
  @RequestMapping(value="/selectCityAll")
  @ResponseBody
  public List<Map<String,Object>>  selectCityAll(HttpServletRequest request){
	   
	  List<Map<String,Object>> list=userService.selectCityAll();
	  return list;
  }
  
  @RequestMapping(value="turnIndexLogin0")
  public  String  turnIndexLogin0(HttpServletRequest request){
	  /*IOC 调用ORM    数据查询与数据传递*/
	  Map<String,Object>  map=RequestUtil.getQueryMap(request);
	  /*注意  商家活动主页面 信息量较多  
	   * 主要分为三大部分的查询结果集
	   * 1.map0  为 头部活动的参与信息
	   * 2.map1 城市对应的活动内容信息
	   * 3.list001 为活动中获奖者的 信息名单*/
	  Map<String,Object> map0=userService.headNumber(map);
	  Map<String,Object> map1=userService.selectCouponMainByCityId(map);
	  List<Map<String,Object>> list001=userService.selectSuccessUserList(map);
	  request.setAttribute("map0", map0);
	  request.setAttribute("map1", map1);
	  request.setAttribute("list001", list001);
	  
	  return   "index";
  }
  
	
}
