package com.project.service;

import java.util.List;

import com.project.model.UserAccess;

public interface UserAccessService {
	 public void insertUser(UserAccess user);
	 public boolean loginUser(UserAccess user);
	 public boolean deleteUser(Long id);
	 public List<UserAccess> getAllUser();
}
