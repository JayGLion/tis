package com.jayg.tis.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserGroupRestController {
	

	@Autowired
	private UserGroupDao userGroupDao;
	
	@RequestMapping("/usergroup/add")
	public UserGroup addUser(UserGroup userGroup) {
		return getOne(userGroupDao.save(userGroup).getUserGroupId());
	}
	
	@RequestMapping(value="/usergroup", method=RequestMethod.POST)
	public UserGroup add(UserGroup userGroup) {
		return getOne(userGroupDao.save(userGroup).getUserGroupId());
	}

	@RequestMapping(value="/usergroup/{id}", method=RequestMethod.GET)
	public UserGroup getOne(@PathVariable int id) {
		UserGroup userGroup = userGroupDao.getOne(id);
		return userGroup;
	}
	
	@RequestMapping(value="/usergroup/put/{id}", method=RequestMethod.PUT)
	public UserGroup put(@PathVariable int id, @PathVariable String name) {
		UserGroup userGroup = getOne(id);
		userGroupDao.save(userGroup);
		return getOne(id);
	}
	
	@RequestMapping(value="/usergroup/del/{id}", method=RequestMethod.DELETE)
	public void put(@PathVariable int id) {
		userGroupDao.delete(id);
	}
	
	@RequestMapping(value="/usergroup/list", method=RequestMethod.GET)
	public List<UserGroup> list() {
		List<UserGroup> list = userGroupDao.findAll();
		return list;
	}

}