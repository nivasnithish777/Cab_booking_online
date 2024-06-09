package com.cab.Model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Driver extends User{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer driverId;
	private String licenceNo;
	private float rating;
	private String currLocation;
	private String currDriverStatus;
	
	@OneToMany(cascade = CascadeType.PERSIST,mappedBy = "driver")
	@JsonIgnore
	List<TripBooking> trips = new ArrayList<>();
	
	public Integer getDriverId() {
		return driverId;
	}

	public String getLicenceNo() {
		return licenceNo;
	}

	public float getRating() {
		return rating;
	}

	public String getCurrLocation() {
		return currLocation;
	}

	public String getCurrDriverStatus() {
		return currDriverStatus;
	}

	public List<TripBooking> getTrips() {
		return trips;
	}

	public Cab getCab() {
		return cab;
	}

	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}

	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public void setCurrLocation(String currLocation) {
		this.currLocation = currLocation;
	}

	public void setCurrDriverStatus(String currDriverStatus) {
		this.currDriverStatus = currDriverStatus;
	}

	public void setTrips(List<TripBooking> trips) {
		this.trips = trips;
	}

	public void setCab(Cab cab) {
		this.cab = cab;
	}

	@OneToOne
	@JsonIgnore
	private Cab cab;
	
}
