package com.kinde.facebook;

public class Client {

	public static void main(String[] args) {

		FacebookService f = new FacebookService();

		User a = new User("a", "a");
		User b = new User("b", "b");

		f.registerUser(a);
		f.registerUser(b);
		
		

		Message postA = new Message(a, "post A");
	    f.post(postA);
		
		f.requestFreind(b, a);
		f.like(b, postA);
		f.like(a, postA); //a ikes his own post

		Message commentB = new Message(b, "b comment on postA");

		f.comment(commentB, postA); //b commented on a 

		// check user a's status after getiing it from DB
		User userA = f.getUser(1);
		Message pa = f.getMessage(1);

		// get a friend for a user
		System.out.println(userA.getFriends().iterator().next().getFirstName());

		// get a post by a user
		System.out.println(f.getPostsbyUser(userA).get(0).getText());

		// get a comment for a post
		System.out.println(pa.getComments().get(0).getText());

		// gets likes for a post
		System.out.println(pa.getLikes());

	}

}
