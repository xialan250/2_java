
package com.itmayiedu.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

//全局捕获异常类
@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(RuntimeException.class)
	//如果返回json格式 @ResponseBody 返回页面 返回string类型 类型结果指定404页面
	@ResponseBody
	public Map<String, Object> resultError() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("errorCode", "500");
		result.put("errorMsg", "系统错误!");
		return result;
	}

}
