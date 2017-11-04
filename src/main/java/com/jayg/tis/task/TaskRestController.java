package com.jayg.tis.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskRestController {
	
	@Autowired
	private TaskDao taskDao;
	
	@RequestMapping(value="/task", method=RequestMethod.POST)
	public Task add(Task task) {
		return getOne(taskDao.save(task).getTaskSeq());
	}

	@RequestMapping(value="/task/{id}", method=RequestMethod.GET)
	public Task getOne(@PathVariable int id) {
		Task task = taskDao.getOne(id);
		return task;
	}
	
	@RequestMapping(value="/task/put/{id}", method=RequestMethod.PUT)
	public Task put(@PathVariable int id, @RequestBody Task task) {
		task.setTaskSeq(id);
		taskDao.save(task);
		return getOne(id);
	}
	
	@RequestMapping(value="/task/del/{id}", method=RequestMethod.DELETE)
	public void put(@PathVariable int id) {
		taskDao.delete(id);
	}
	
	@RequestMapping(value="/task/list", method=RequestMethod.GET)
	public List<Task> list() {
		List<Task> list = taskDao.findAll();
		return list;
	}

}