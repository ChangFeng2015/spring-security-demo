package com.imooc.web.controller;

import java.util.List;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;
import com.imooc.dto.User;
import com.imooc.dto.UserQueryCondition;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping
	@JsonView(User.UserSimpleView.class)
	public List<User> query(UserQueryCondition userQueryCondition) {
		System.out.println(ReflectionToStringBuilder.toString(userQueryCondition, ToStringStyle.MULTI_LINE_STYLE));
		return null;
	}
	
	@GetMapping("/{id:\\d+}")
	@JsonView(User.UserDetailView.class)
	public User getUser(@PathVariable(value = "id")String id) {
		User user = new User();
		user.setUserName("jojo");
		return user;
	}
	
	@PostMapping
	public User createUser(@RequestBody User user) {
		System.out.println(ReflectionToStringBuilder.toString(user, ToStringStyle.MULTI_LINE_STYLE));
		user.setId(1);
		return user;
	}
}
