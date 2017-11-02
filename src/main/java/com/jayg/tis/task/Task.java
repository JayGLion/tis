package com.jayg.tis.task;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.jayg.tis.project.Project;

@Entity
public class Task implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2224846327463516111L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int taskSeq = 0;
	@OneToOne
	@JoinColumn(name="projectSeq")
	private Project project;
	@OneToOne
	@JoinColumn(name="taskGroupSeq")
	private TaskGroup taskGroup;
	private int taskLevel = 0;
	private String taskLevelName = "";
	private int sortOrder = 0;
	private String planStartTime = "";
	private String planEndTime = "";
	private String planExecutionTime = "";
	private String realStartTime = "";
	private String realEndTime = "";
	private String realExecutionTime = "";
	private String personInCharge = "";
	private String personInChargeSub = "";
	private String status = "";
	private int progress = 0;
	private String taskSeqs = "";
	private String sortOrders = "";
	private String taskLevels = "";
	private String progresses = "";
	private int searchProjectSeq = 0;
	private int searchTaskGroupSeq = 0;
	private String startYn = "";
	private String endYn = "";
	
	public int getTaskSeq() {
		return taskSeq;
	}
	public void setTaskSeq(int taskSeq) {
		this.taskSeq = taskSeq;
	}
	public int getTaskLevel() {
		return taskLevel;
	}
	public void setTaskLevel(int taskLevel) {
		this.taskLevel = taskLevel;
	}
	public String getTaskLevelName() {
		return taskLevelName;
	}
	public void setTaskLevelName(String taskLevelName) {
		this.taskLevelName = taskLevelName;
	}
	public int getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}
	public String getPlanStartTime() {
		return planStartTime;
	}
	public void setPlanStartTime(String planStartTime) {
		this.planStartTime = planStartTime;
	}
	public String getPlanEndTime() {
		return planEndTime;
	}
	public void setPlanEndTime(String planEndTime) {
		this.planEndTime = planEndTime;
	}
	public String getPlanExecutionTime() {
		return planExecutionTime;
	}
	public void setPlanExecutionTime(String planExecutionTime) {
		this.planExecutionTime = planExecutionTime;
	}
	public String getRealStartTime() {
		return realStartTime;
	}
	public void setRealStartTime(String realStartTime) {
		this.realStartTime = realStartTime;
	}
	public String getRealEndTime() {
		return realEndTime;
	}
	public void setRealEndTime(String realEndTime) {
		this.realEndTime = realEndTime;
	}
	public String getRealExecutionTime() {
		return realExecutionTime;
	}
	public void setRealExecutionTime(String realExecutionTime) {
		this.realExecutionTime = realExecutionTime;
	}
	public String getPersonInCharge() {
		return personInCharge;
	}
	public void setPersonInCharge(String personInCharge) {
		this.personInCharge = personInCharge;
	}
	public String getPersonInChargeSub() {
		return personInChargeSub;
	}
	public void setPersonInChargeSub(String personInChargeSub) {
		this.personInChargeSub = personInChargeSub;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getProgress() {
		return progress;
	}
	public void setProgress(int progress) {
		this.progress = progress;
	}
	public String getTaskSeqs() {
		return taskSeqs;
	}
	public void setTaskSeqs(String taskSeqs) {
		this.taskSeqs = taskSeqs;
	}
	public String getSortOrders() {
		return sortOrders;
	}
	public void setSortOrders(String sortOrders) {
		this.sortOrders = sortOrders;
	}
	public String getTaskLevels() {
		return taskLevels;
	}
	public void setTaskLevels(String taskLevels) {
		this.taskLevels = taskLevels;
	}
	public String getProgresses() {
		return progresses;
	}
	public void setProgresses(String progresses) {
		this.progresses = progresses;
	}
	public int getSearchProjectSeq() {
		return searchProjectSeq;
	}
	public void setSearchProjectSeq(int searchProjectSeq) {
		this.searchProjectSeq = searchProjectSeq;
	}
	public int getSearchTaskGroupSeq() {
		return searchTaskGroupSeq;
	}
	public void setSearchTaskGroupSeq(int searchTaskGroupSeq) {
		this.searchTaskGroupSeq = searchTaskGroupSeq;
	}
	public String getStartYn() {
		return startYn;
	}
	public void setStartYn(String startYn) {
		this.startYn = startYn;
	}
	public String getEndYn() {
		return endYn;
	}
	public void setEndYn(String endYn) {
		this.endYn = endYn;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	public TaskGroup getTaskGroup() {
		return taskGroup;
	}
	public void setTaskGroup(TaskGroup taskGroup) {
		this.taskGroup = taskGroup;
	}
	
}
