package com.cab.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CurrentUserSession {

	@Id
	private Integer currUserId;
	private String uuid;
	private String currRole;
	private String currStatus;
	public Integer getCurrUserId() {
		return currUserId;
	}
	public String getUuid() {
		return uuid;
	}
	public String getCurrRole() {
		return currRole;
	}
	public String getCurrStatus() {
		return currStatus;
	}
	public void setCurrUserId(Integer currUserId) {
		this.currUserId = currUserId;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public void setCurrRole(String currRole) {
		this.currRole = currRole;
	}
	public void setCurrStatus(String currStatus) {
		this.currStatus = currStatus;
	}
	
	
}
