package com.yz.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yz.bean.User;
import com.yz.service.UserService;

@Controller
public class UserController {

	
	@Resource
	private UserService service;
	
	@RequestMapping("/list.do")
	public String list(Model model) {
		
		List<User> list = service.UserList();
		
		model.addAttribute("list", list);
		return "list";
	}
}
