package com.mc.srqservice.domain;

public class SrqDomain {
	
	/*public SrqDomain(String key,String value) {
		
	}
	
	public SrqDomain() {
		
	}*/
	private String formattedId;
	public String getFormattedId() {
		return formattedId;
	}
	public void setFormattedId(String formattedId) {
		this.formattedId = formattedId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getScheduleState() {
		return scheduleState;
	}
	public void setScheduleState(String scheduleState) {
		this.scheduleState = scheduleState;
	}
	public String getBlocked() {
		return blocked;
	}
	public void setBlocked(String blocked) {
		this.blocked = blocked;
	}
	public String getDisplaycolor() {
		return displaycolor;
	}
	public void setDisplaycolor(String displaycolor) {
		this.displaycolor = displaycolor;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getIteration() {
		return iteration;
	}
	public void setIteration(String iteration) {
		this.iteration = iteration;
	}
	public String getPlanEstimate() {
		return planEstimate;
	}
	public void setPlanEstimate(String planEstimate) {
		this.planEstimate = planEstimate;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	private String name;
	private String scheduleState;
	private String blocked;
	@Override
	public String toString() {
		return "SrqDomain [formattedId=" + formattedId + ", name=" + name + ", scheduleState=" + scheduleState
				+ ", blocked=" + blocked + ", displaycolor=" + displaycolor + ", owner=" + owner + ", creationDate="
				+ creationDate + ", iteration=" + iteration + ", planEstimate=" + planEstimate + ", feature=" + feature + 
				 ",createdBy=" + createdBy + "]";
	}
	private String displaycolor;
	private String owner;
	private String creationDate;
	private String iteration;
	private String planEstimate;
	private String feature;
	private String createdBy;
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
}
