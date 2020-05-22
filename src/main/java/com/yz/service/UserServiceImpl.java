package com.yz.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yz.bean.User;
import com.yz.dao.UserMapperDao;

@Service
public class UserServiceImpl implements UserService{

	
	@Resource
	private UserMapperDao dao;

	@Override
	public List<User> UserList() {
		// TODO Auto-generated method stub
		return dao.UserList();
	}
}
