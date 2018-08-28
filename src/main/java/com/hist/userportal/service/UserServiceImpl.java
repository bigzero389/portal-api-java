package com.hist.userportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hist.userportal.domain.User;
import com.hist.userportal.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository repository;

	@Override
	public User create(User user) {
		return repository.save(user);
	}

	@Override
	public User delete(Long id) {
		User user = this.findById(id);
		if(user != null) {
			repository.delete(user);
		}
		return user;
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	public User findById(Long id) {
		Optional<User> user = repository.findById(id);
		repository.deleteById(id);
		return user.get();
	}

	@Override
	public User update(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
