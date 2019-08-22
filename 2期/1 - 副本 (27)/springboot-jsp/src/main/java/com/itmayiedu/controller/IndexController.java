
package com.itmayiedu.controller;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itmayiedu.entity.User;
import com.itmayiedu.mapper.UserMapper;

@Controller
public class IndexController {
	@Autowired
	private UserMapper userMapper;

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@ResponseBody
	@RequestMapping("/findByName")
	public User findByName(String name) {
		return userMapper.findByName(name);
	}

	@ResponseBody
	@RequestMapping("/insert")
	public String insert(String name, Integer age) {
		userMapper.insert(name, age);
		return "success";
	}

}
