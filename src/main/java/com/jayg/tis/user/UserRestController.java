package com.jayg.tis.user;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jayg.tis.user.UserDao;

@RestController
public class UserRestController {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/add")
	public User addUser(User user) {
		return getOne(userDao.save(user).getUserSeq());
	}
	
	@RequestMapping(value="/user", method=RequestMethod.POST)
	public User add(User user) {
		user.setLoginDate(new Date());
		return getOne(userDao.save(user).getUserSeq());
	}

	@RequestMapping(value="/user/{id}", method=RequestMethod.GET)
	public User getOne(@PathVariable int id) {
		User user = userDao.getOne(id);
		return user;
	}
	
	@RequestMapping(value="/user/put/{id}", method=RequestMethod.PUT)
	public User put(@PathVariable int id, @PathVariable String name) {
		User user = getOne(id);
		userDao.save(user);
		return getOne(id);
	}
	
	@RequestMapping(value="/user/del/{id}", method=RequestMethod.DELETE)
	public void put(@PathVariable int id) {
		userDao.delete(id);
	}
	
	@RequestMapping(value="/user/list", method=RequestMethod.GET)
	public List<User> list() {
		List<User> list = userDao.findAll();
		return list;
	}

}