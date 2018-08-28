package com.hist.userportal.service;

import java.util.Iterator;
import java.util.List;

import com.hist.userportal.domain.User;

public interface UserService {
	
	public User create(User user);
	
	public User delete(Long id);

	public List findAll();
	
	public User findById(Long id) ;
	
	public User update(User user);

}
