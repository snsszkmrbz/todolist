package com.ballikaya.todolist.service.service;

import com.ballikaya.todolist.model.User;

public interface UserService {

	public User saveUser(User user);

	public User getUser(String userName);

	public void remmoveByUserName(String userName);

}
