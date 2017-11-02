package com.jayg.tis.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectRestController {
	
	@Autowired
	private ProjectDao projectDao;
	
	@RequestMapping("/project/add") //test
	public Project addProject(Project Project) {
		return getOne(projectDao.save(Project).getProjectSeq());
	}
	
	@RequestMapping(value="/project", method=RequestMethod.POST)
	public Project add(Project Project) {
		return getOne(projectDao.save(Project).getProjectSeq());
	}

	@RequestMapping(value="/project/{id}", method=RequestMethod.GET)
	public Project getOne(@PathVariable int id) {
		Project Project = projectDao.getOne(id);
		return Project;
	}
	
	@RequestMapping(value="/project/put/{id}", method=RequestMethod.PUT)
	public Project put(@PathVariable int id, @PathVariable String name) {
		Project Project = getOne(id);
		projectDao.save(Project);
		return getOne(id);
	}
	
	@RequestMapping(value="/project/del/{id}", method=RequestMethod.DELETE)
	public void put(@PathVariable int id) {
		projectDao.delete(id);
	}
	
	@RequestMapping(value="/project/list", method=RequestMethod.GET)
	public List<Project> list() {
		List<Project> list = projectDao.findAll();
		return list;
	}

}