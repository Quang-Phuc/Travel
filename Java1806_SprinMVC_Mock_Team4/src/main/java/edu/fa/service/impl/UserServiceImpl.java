package edu.fa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fa.model.User;
import edu.fa.repository.UserRepository;
import edu.fa.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	// JPA

	
	@Override
	public User findOneUserByUserNameAndPassword(String userName, String password) {
		// TODO Auto-generated method stub
		return userRepository.findOneUserByUserNameAndPassword(userName, password);
	}

	@Override
	public User findOneUserByUserName(String userName) {
		// TODO Auto-generated method stub
		return userRepository.findOneUserByUserName(userName);
	}

	@Override
	public User save(User user) {

		return userRepository.save(user);
	}

	@Override
	public List<User> findByPasswordAndRole(int roleId) {
		// TODO Auto-generated method stub
		return null;
	}

}