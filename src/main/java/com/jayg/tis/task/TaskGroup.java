package com.jayg.tis.task;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TaskGroup implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7000919418403250138L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int taskGroupSeq = 0;
	private int projectSeq = 0;
	private String projectName = "";
	private String taskGroupName = "";
	private String taskGroupDescription = "";
	private String searchTaskGroupName = "";
	private int progress = 0;
	private int sortOrder = 1;
	private String firstLevelTaskName = "";
	
	public int getTaskGroupSeq() {
		return taskGroupSeq;
	}
	public void setTaskGroupSeq(int taskGroupSeq) {
		this.taskGroupSeq = taskGroupSeq;
	}
	public int getProjectSeq() {
		return projectSeq;
	}
	public void setProjectSeq(int projectSeq) {
		this.projectSeq = projectSeq;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getTaskGroupName() {
		return taskGroupName;
	}
	public void setTaskGroupName(String taskGroupName) {
		this.taskGroupName = taskGroupName;
	}
	public String getTaskGroupDescription() {
		return taskGroupDescription;
	}
	public void setTaskGroupDescription(String taskGroupDescription) {
		this.taskGroupDescription = taskGroupDescription;
	}
	public String getSearchTaskGroupName() {
		return searchTaskGroupName;
	}
	public void setSearchTaskGroupName(String searchTaskGroupName) {
		this.searchTaskGroupName = searchTaskGroupName;
	}
	public int getProgress() {
		return progress;
	}
	public void setProgress(int progress) {
		this.progress = progress;
	}
	public int getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}
	public String getFirstLevelTaskName() {
		return firstLevelTaskName;
	}
	public void setFirstLevelTaskName(String firstLevelTaskName) {
		this.firstLevelTaskName = firstLevelTaskName;
	}
}
