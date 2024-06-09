package com.cab.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cab {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cabId;
	private String carType;
	
	public Integer getCabId() {
		return cabId;
	}

	public String getCarType() {
		return carType;
	}

	public String getCarName() {
		return carName;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public float getPerKmRate() {
		return perKmRate;
	}

	public String getCurrLocation() {
		return CurrLocation;
	}

	public String getCabCurrStatus() {
		return cabCurrStatus;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setCabId(Integer cabId) {
		this.cabId = cabId;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public void setPerKmRate(float perKmRate) {
		this.perKmRate = perKmRate;
	}

	public void setCurrLocation(String currLocation) {
		CurrLocation = currLocation;
	}

	public void setCabCurrStatus(String cabCurrStatus) {
		this.cabCurrStatus = cabCurrStatus;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	private String carName;
	private String carNumber;
	private float perKmRate;
	private String CurrLocation;
	private String cabCurrStatus;
	
	@OneToOne
	@JsonIgnore
	private Driver driver;
	
}
