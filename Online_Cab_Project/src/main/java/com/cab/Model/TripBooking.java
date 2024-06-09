package com.cab.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TripBooking {

	
	
	public Integer getTripBookingId() {
		return tripBookingId;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public String getFromDateTime() {
		return fromDateTime;
	}

	public String getDropLocation() {
		return dropLocation;
	}

	public String getToDateTime() {
		return toDateTime;
	}

	public float getDistanceInKm() {
		return distanceInKm;
	}

	public String getCurrStatus() {
		return currStatus;
	}

	public Driver getDriver() {
		return driver;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Cab getCab() {
		return cab;
	}

	public void setTripBookingId(Integer tripBookingId) {
		this.tripBookingId = tripBookingId;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public void setFromDateTime(String fromDateTime) {
		this.fromDateTime = fromDateTime;
	}

	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}

	public void setToDateTime(String toDateTime) {
		this.toDateTime = toDateTime;
	}

	public void setDistanceInKm(float distanceInKm) {
		this.distanceInKm = distanceInKm;
	}

	public void setCurrStatus(String currStatus) {
		this.currStatus = currStatus;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setCab(Cab cab) {
		this.cab = cab;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer tripBookingId;
	@NotNull
	private String pickupLocation;
	@NotNull
	private String fromDateTime;
	@NotNull
	private String dropLocation;
	@NotNull
	private String toDateTime;
	@NotNull
	private float distanceInKm;
	@JsonIgnore
	private String currStatus;
	
	@ManyToOne(cascade = CascadeType.REMOVE)
	@JsonIgnore
	private Driver driver;
	
	@ManyToOne(cascade = CascadeType.REMOVE)
	@JsonIgnore
	private Customer customer;
	
	@ManyToOne(cascade = CascadeType.REMOVE)
	@JsonIgnore
	private Cab cab;

}
