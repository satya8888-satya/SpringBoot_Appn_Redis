package com.springRedis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springRedis.model.User_Emp;
import com.springRedis.repository.UserDao;

public class UserServiceImpl implements UserService{

	 @Autowired
	    private UserDao userDao;

	    @Override
	    public boolean saveUser(User_Emp user) {
	        return userDao.saveUser(user);
	    }

	    @Override
	    public List<User_Emp> fetchAllUser() {
	        return userDao.fetchAllUser();
	    }

	    @Override
	    public User_Emp fetchUserById(Long id) {
	        return userDao.fetchUserById(id);
	    }

	    @Override
	    public boolean deleteUser(Long id) {
	        return userDao.deleteUser(id);
	    }

	    @Override
	    public boolean updateUser(Long id, User_Emp user) {
	        return userDao.updateUser(id,user);
	    }


		

}
