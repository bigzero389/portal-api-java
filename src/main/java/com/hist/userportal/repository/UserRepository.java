package com.hist.userportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.hist.userportal.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
//	void delete(User user);
//	
//	List<User> findAll();
//	
//	User findOne(Long id);
//	
//	User save(User user);

}
