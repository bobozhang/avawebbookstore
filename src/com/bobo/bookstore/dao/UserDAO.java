package com.bobo.bookstore.dao;

import com.bobo.bookstore.domain.User;

 
public interface UserDAO {

	/**
	 * �����û�����ȡ User ����
	 * @param username
	 * @return
	 */
	public abstract User getUser(String username);

}

