package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.UserAccess;
import com.project.repository.UserAccessRepository;

@Service
public class UserAccessServiceImpl implements UserAccessService {

//	@Autowired
//	private UserAccessDAO userAccessDAO;
	
	@Autowired
    UserAccessRepository userAccessRepo;
	
	@Override
	public void insertUser(UserAccess user) {
	
		//Object user1=new UserAccess();
		 userAccessRepo.save(user);
		//userAccessDAO.registerUser(user);
		
	}

	@Override
	public boolean loginUser(UserAccess user) {
		UserAccess userAccess=new UserAccess();
		userAccess=userAccessRepo.findById(user.getId()).get();
        boolean a=user.getPassword().equals(userAccess.getPassword())
        		 &&  user.getUserName().equals(userAccess.getUserName());
   
		   return a;
	     }


	public List<UserAccess> getAllUser() {
		// TODO Auto-generated method stub
		
		return (List<UserAccess>)
	            userAccessRepo.findAll();
	}
	
	public boolean deleteUser(Long id)
	{
		userAccessRepo.deleteById(id);
		return true;
	}

//	@Override
//	public String loginUser(UserAccess user1) {
//		
//		
//		
//	}
//
//	@Override
//	public UserAccess getById(Long id) {
//		UserAccess user=new UserAccess();
//		user=userAccessDAO.getUserById(id);
//		return user;
//	}

}
