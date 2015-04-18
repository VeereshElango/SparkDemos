package com.crud.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserService {
	private List<String> usersList = new ArrayList<String>(Arrays.asList("Veersh","Ram","Arvind"));
	
	
	public List<String> getUsers(){
		return usersList;
	}
	public Boolean addUser(String username){
		usersList.add(username);
		return true;
	}

}
