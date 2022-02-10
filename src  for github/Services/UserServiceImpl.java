package com.user.Services;


import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.Model.User;
import com.user.Repository.UserRepository;

@Service
public class UserServiceImpl implements Iuser {
	@Autowired
	UserRepository dao;
	
	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		User product=dao.save(user);
		  return user;
	}
	

}
