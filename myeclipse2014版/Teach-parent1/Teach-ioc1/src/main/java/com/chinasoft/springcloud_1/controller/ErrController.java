package com.chinasoft.springcloud_1.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrController implements ErrorController{
    /*在后端 设置一个项目首页的 访问控制器*/
	@RequestMapping("/")
	public String showIndex(HttpServletRequest request){
		return "cityStart";
	}
	
	/*首先IOC线程抛出异常  会自动访问error路径*/
	@RequestMapping("/error") 
	public String showError(HttpServletRequest request){
		return getErrorPath();
	}
	
	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "error";
	}

}
