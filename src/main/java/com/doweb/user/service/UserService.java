package com.doweb.user.service;

import org.springframework.stereotype.Repository;


/**
 * UserService interface
 * 
 */
@Repository
public interface UserService {

	User getUserById(int id);
	int  insertUser(User user);
}
