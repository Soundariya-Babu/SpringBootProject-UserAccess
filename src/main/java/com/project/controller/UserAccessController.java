package com.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.project.model.UserAccess;
import com.project.service.UserAccessService;

@RestController
@RequestMapping("/user")
public class UserAccessController {
	@Autowired 
	private UserAccessService userAccessService;
	
	@PostMapping("/save")	 
	public String Store(@RequestBody UserAccess user) 
	{   
			if(user.getId()!=null) {
			userAccessService.insertUser(user);
			return "success";
		}
		return "failure";
		
	}
	
	@PostMapping("/login")	 
	public String loginUser(@RequestParam("username") String username, 
			@RequestParam("password") String password, @RequestParam("id") Long id) 
	{   
	UserAccess user=new UserAccess();
	user.setUserName(username);
	user.setPassword(password);
	user.setId(id);
	boolean s;
	s=userAccessService.loginUser(user);
	if( s==true) {
		return "Success";
	}
		
		return "Failure";
	}


	@GetMapping ("/getUsers")
	public 	List<UserAccess> displayAllusers()
	{
		List<UserAccess> users=new ArrayList<>();
		 users=userAccessService.getAllUser();
		 
		 return users;
		
	}

	@DeleteMapping("/delete")
	public String delete(@RequestParam("id") Long id) {

	userAccessService.deleteUser(id);
		return "success";
	}
	
		
	
}
