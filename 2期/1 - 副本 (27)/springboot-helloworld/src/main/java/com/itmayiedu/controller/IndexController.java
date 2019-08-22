
package com.itmayiedu.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {

	@RequestMapping("/indexController")
	public String indexController(Map<String, Object> result) {
//		int i = 1/0;
//		return "IndexController";
		
		System.out.println("IndexController....index");
		result.put("name", "yushengjun");
		result.put("sex", 1);
		List<String> list = new ArrayList<String>();
		list.add("zhangsan");
		list.add("lisi");
		result.put("userlist", list);
		return "index";
	}

}
