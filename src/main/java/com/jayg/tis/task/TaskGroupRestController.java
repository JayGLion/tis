package com.jayg.tis.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskGroupRestController {
	
	@Autowired
	private TaskGroupDao taskGroupDao;
	
	@RequestMapping(value="/taskgroup", method=RequestMethod.POST)
	public TaskGroup add(TaskGroup taskGroup) {
		return getOne(taskGroupDao.save(taskGroup).getTaskGroupSeq());
	}

	@RequestMapping(value="/taskgroup/{id}", method=RequestMethod.GET)
	public TaskGroup getOne(@PathVariable int id) {
		TaskGroup taskGroup = taskGroupDao.getOne(id);
		return taskGroup;
	}
	
	@RequestMapping(value="/taskgroup/{id}", method=RequestMethod.PUT)
	public TaskGroup put(@PathVariable int id, @RequestBody TaskGroup taskGroup) {
		taskGroup.setTaskGroupSeq(id);
		taskGroupDao.save(taskGroup);
		return getOne(id);
	}
	
	@RequestMapping(value="/taskgroup/{id}", method=RequestMethod.DELETE)
	public void put(@PathVariable int id) {
		taskGroupDao.delete(id);
	}
	
	@RequestMapping(value="/taskgroup/list", method=RequestMethod.GET)
	public List<TaskGroup> list() {
		List<TaskGroup> list = taskGroupDao.findAll();
		return list;
	}

}