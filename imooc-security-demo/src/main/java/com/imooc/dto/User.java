package com.imooc.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * @author Dave
 *
 */
public class User {
	
	public interface UserSimpleView{};
	public interface UserDetailView extends UserSimpleView {};
	
	private int id;
	
	private String userName;

	private String password;
	
	private Date birthDay;

	@JsonView(UserSimpleView.class)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@JsonView(UserDetailView.class)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	
	
}
