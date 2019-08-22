
package com.itmayiedu.service;

import com.itmayiedu.dao.UserDao;

public class UserService {

	private UserDao userDao;

	public void add() {
		System.out.println("UserService add()");
		userDao.add();
	}

	public UserDao getUserDao() {

		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		System.out.println("set userDao");
		this.userDao = userDao;
	}

}
