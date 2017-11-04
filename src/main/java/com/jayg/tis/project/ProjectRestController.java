package com.jayg.tis.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectRestController {
	
	@Autowired
	private ProjectDao projectDao;
	
	@RequestMapping(value="/project", method=RequestMethod.POST)
	public Project add(Project Project) {
		return getOne(projectDao.save(Project).getProjectSeq());
	}

	@RequestMapping(value="/project/{id}", method=RequestMethod.GET)
	public Project getOne(@PathVariable int id) {
		return projectDao.getOne(id);
	}
	
	@RequestMapping(value="/project/{id}", method=RequestMethod.PUT)
	public Project put(@PathVariable int id, @RequestBody Project project) {
		project.setProjectSeq(id);
		projectDao.save(project);
		return getOne(id);
	}
	
	@RequestMapping(value="/project/{id}", method=RequestMethod.DELETE)
	public void put(@PathVariable int id) {
		projectDao.delete(id);
	}
	
	@RequestMapping(value="/project/list", method=RequestMethod.GET)
	public List<Project> list() {
		List<Project> list = projectDao.findAll();
		return list;
	}

}