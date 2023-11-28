package com.springRedis.repository;

import java.util.List;

import com.springRedis.model.User_Emp;

public interface UserDao {
	 boolean saveUser(User_Emp user);

	    List<User_Emp> fetchAllUser();

	    User_Emp fetchUserById(Long id);

	    boolean deleteUser(Long id);

	    boolean updateUser(Long id, User_Emp user);
	}


