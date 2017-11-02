package com.jayg.tis.project;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Project implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4635246988798020135L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int projectSeq = 0;
	private String projectName = "";
	private String projectDescription = "";
	private String startDate = "";
	private String endDate = "";
	private String clientCompany = "";
	private String clientManager = "";
	private String projectManager = "";
	private String departureCenter = "";
	private String destinationCenter = "";
	private String status = "";
	private String statusName = "";
	private int statusCount = 0;
	private String scale = "";
	private String stopYn = "";
	private String realStartDate = "";
	private float progress = 0;
	private float planProgress = 0;
	private String planEndTime = "";
	private String prospectEndDate = "";
	@Column(nullable = true)
	private long RealStartGap = 0;
	@Column(nullable = true)
	private long RealEndGap = 0;
	private float progressGap = 0;
	private String searchProjectName = "";
	private String searchStartDate = "";
	private String searchEndDate = "";
	private String userId = "";
	private String superAdminYn = "";
	
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
	public String getProjectDescription() {
		return projectDescription;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getClientCompany() {
		return clientCompany;
	}
	public void setClientCompany(String clientCompany) {
		this.clientCompany = clientCompany;
	}
	public String getClientManager() {
		return clientManager;
	}
	public void setClientManager(String clientManager) {
		this.clientManager = clientManager;
	}
	public String getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}
	public String getDepartureCenter() {
		return departureCenter;
	}
	public void setDepartureCenter(String departureCenter) {
		this.departureCenter = departureCenter;
	}
	public String getDestinationCenter() {
		return destinationCenter;
	}
	public void setDestinationCenter(String destinationCenter) {
		this.destinationCenter = destinationCenter;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getScale() {
		return scale;
	}
	public void setScale(String scale) {
		this.scale = scale;
	}
	public String getStopYn() {
		return stopYn;
	}
	public void setStopYn(String stopYn) {
		this.stopYn = stopYn;
	}
	public String getRealStartDate() {
		return realStartDate;
	}
	public void setRealStartDate(String realStartDate) {
		this.realStartDate = realStartDate;
	}
	public float getProgress() {
		return progress;
	}
	public void setProgress(float progress) {
		this.progress = progress;
	}
	public float getPlanProgress() {
		return planProgress;
	}
	public void setPlanProgress(float planProgress) {
		this.planProgress = planProgress;
	}
	public String getPlanEndTime() {
		return planEndTime;
	}
	public void setPlanEndTime(String planEndTime) {
		this.planEndTime = planEndTime;
	}
	public String getProspectEndDate() {
		return prospectEndDate;
	}
	public void setProspectEndDate(String prospectEndDate) {
		this.prospectEndDate = prospectEndDate;
	}
	public String getSearchProjectName() {
		return searchProjectName;
	}
	public void setSearchProjectName(String searchProjectName) {
		this.searchProjectName = searchProjectName;
	}
	public String getSearchStartDate() {
		return searchStartDate;
	}
	public void setSearchStartDate(String searchStartDate) {
		this.searchStartDate = searchStartDate;
	}
	public String getSearchEndDate() {
		return searchEndDate;
	}
	public void setSearchEndDate(String searchEndDate) {
		this.searchEndDate = searchEndDate;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public int getStatusCount() {
		return statusCount;
	}
	public void setStatusCount(int statusCount) {
		this.statusCount = statusCount;
	}
	public long getRealStartGap() {
		return RealStartGap;
	}
	public void setRealStartGap(long realStartGap) {
		RealStartGap = realStartGap;
	}
	public long getRealEndGap() {
		return RealEndGap;
	}
	public void setRealEndGap(long realEndGap) {
		RealEndGap = realEndGap;
	}
	public float getProgressGap() {
		return progressGap;
	}
	public void setProgressGap(float progressGap) {
		this.progressGap = progressGap;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getSuperAdminYn() {
		return superAdminYn;
	}
	public void setSuperAdminYn(String superAdminYn) {
		this.superAdminYn = superAdminYn;
	}
}
