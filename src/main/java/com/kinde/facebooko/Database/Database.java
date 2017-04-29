package com.kinde.facebooko.Database;

import java.util.HashMap;
import java.util.Map;

import com.kinde.facebook.Message;
import com.kinde.facebook.User;



public class Database {
	
	private static Map<Integer,User> users =new HashMap<Integer,User>();
	private static Map<Integer,Message> posts =new HashMap<Integer,Message>();
	private static Map<Integer,Message> comments =new HashMap<Integer,Message>();
	
	private static Integer userKey=1;
	private static Integer messageKey=1;
	
	private Database(){
		
	}

	public static  Map<Integer,User> getUsers() {
		return users;
	}	
	
	
	public static Map<Integer, Message> getMessages() {
		return posts;
	}
	
	public static Map<Integer,Message> getComments() {
		return comments;
	}

	public static void setComments(Map<Integer,Message> comments) {
		Database.comments = comments;
	}

	

	public static Integer createUser(User u){					
			u.setId(userKey);
			users.put(userKey,u);
			userKey++;			
		
		return u.getId();
		
	}
	
	public static Integer  saveMessage(Message m){
		m.setId(messageKey);
		posts.put(messageKey, m);		
		messageKey++;
		return m.getId();
	}
	
	
	
	
	
	

}
