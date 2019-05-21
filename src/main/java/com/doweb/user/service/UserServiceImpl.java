package com.doweb.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doweb.user.dao.IUserDao;

/**
 * 
 * 
 * @author 	lizonghui
 */
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private IUserDao userDao;

	@Override
	public User getUserById(int id) {
		return userDao.selectByPrimaryKey(id);
	}

	@Override
	public int insertUser(User user) {
		
		userDao.insert(user);
		
		return 0;
	}
	


}