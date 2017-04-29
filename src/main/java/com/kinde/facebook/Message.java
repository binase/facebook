package com.kinde.facebook;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Message {
	
	private Integer id;
	private User user;
	private String text;
	private Date date;
	private Integer likes=new Integer(0);	
	private List<Message> comments= new ArrayList<Message>();
	
	public Message(String text,User u){
		this.text=text;		
		this.user=u;
		this.date=new Date();
	}
	
	public Message(User u,String text){
		this.text=text;		
		this.user=u;
		this.date=new Date();
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer like) {
		this.likes = like;
	}
	

	public List<Message> getComments() {
		return comments;
	}

	public void setComments(List<Message> comments) {
		this.comments = comments;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

   	
	
	

}
