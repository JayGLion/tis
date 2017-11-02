/*
package com.jayg.tis.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping("/list")
	public List<UserVO> getList() {
		return userService.selectUserList();
	}
}
*/