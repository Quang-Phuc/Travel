package edu.fa.service;

import java.util.List;

import edu.fa.model.User;

public interface UserService {
	

	
	
	
	List<User> findByPasswordAndRole(int roleId);
	//jpa
	
	User findOneUserByUserNameAndPassword(String userName, String password);
	User findOneUserByUserName(String userName);
	User save(User user);
}
