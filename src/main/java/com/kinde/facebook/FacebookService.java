package com.kinde.facebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.kinde.facebooko.Database.Database;

public class FacebookService implements IFacebookService{
	
	private Map<Integer,User> users=Database.getUsers();	
	private Map<Integer,Message> messages=Database.getMessages();
	
	
	public int registerUser(User u){
		return Database.createUser(u);
		
	}

	public int post(Message message) {
		return Database.saveMessage(message);		
		//User u=users.get(user.getId());
		//u.getPosts().add(message);
		
	}

	public boolean requestFreind(User requestor, User requestee) {
		//toBeFriended.getPendingFreindRequest().add(toBeFriended);
		User r=users.get(requestor.getId());
		User approver=users.get(requestee.getId());		
		
		r.getFriends().add(requestee);
		approver.getFriends().add(requestor);
		return true; 
	}

	public void unfreind(User requestor, User requestee) {
		User r=users.get(requestor.getId());
		User approver=users.get(requestee.getId());	
		
		r.getFriends().remove(requestee);
		approver.getFriends().remove(requestor);		
		
	}

	public void like(User liker, Message m) {
		Message mes=messages.get(m.getId());
		int i=mes.getLikes();
		m.setLikes(i+1);
		// we are not storing who liked it 
		
	}

	

	public void comment(Message comment, Message post) {
		// save the comment first
		Database.saveMessage(comment);
		
		Message p=messages.get(post.getId());
		Message c=messages.get(comment.getId());
		p.getComments().add(c);
		
		
	}

	public Map<Integer,User> getUsers() {
		return users;
	}
	
	public Map<Integer, Message> getMessages(){
		return messages;
	}
	
	public User getUser(Integer id){
		return users.get(id);
	}
	
	public Message getMessage(Integer id){
		return messages.get(id);
	}
	
	public List<Message> getPostsbyUser(User u){
		//iterate the messages/posts 
		List<Message> posts=new ArrayList<Message>();		
		for(Map.Entry<Integer, Message> entry:messages.entrySet()){
			Message m=entry.getValue();
			if(m.getUser().getId()==u.getId()){
				posts.add(entry.getValue());
			}
			
		}
		return posts;
	}

	

}
