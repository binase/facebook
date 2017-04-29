package com.kinde.facebook;

public interface IFacebookService {
	
	public int post( Message message);
	public boolean requestFreind(User requestor, User toBeFriended);
	public void unfreind(User requestor, User toBeUnfriended);
	public void like(User liker, Message m);	
	public void comment( Message comment, Message post );
	
	

}
