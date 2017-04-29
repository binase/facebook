package com.kinde.facebook;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class User {
	
	private Integer id;
	private String firstName;
	private String lastName;
	private Set<User> friends= new HashSet<User>();
	private Set<User> pendingFreindRequest=new HashSet<User>();
	//private List<Message> posts= new ArrayList<Message>();
	
	
	public User(String fName, String lName){
		this.firstName=fName;
		this.lastName=lName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<User> getFriends() {
		return friends;
	}

	public void setFriends(Set<User> friends) {
		this.friends = friends;
	}

	/*public List<Message> getPosts() {
		return posts;
	}

	public void setPosts(List<Message> posts) {
		this.posts = posts;
	}*/

	public Set<User> getPendingFreindRequest() {
		return pendingFreindRequest;
	}

	public void setPendingFreindRequest(Set<User> pendingRequest) {
		this.pendingFreindRequest = pendingRequest;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	

}
