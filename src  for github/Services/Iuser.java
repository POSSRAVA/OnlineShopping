package com.user.Services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.user.Model.User;
//@Service
//@Transactional
@Component
public interface Iuser {

	public User updateUser(User user);

}
