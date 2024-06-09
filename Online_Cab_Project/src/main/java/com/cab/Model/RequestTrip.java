package com.cab.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestTrip {

	private Integer tripBookingId;
	private String pickupLocation;
	private String fromDateTime;
	private String dropLocation;
	private String toDateTime;
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


	public String getCarType() {
		return carType;
	}


	public String getCabStatus() {
		return CabStatus;
	}


	public String getBookingStatus() {
		return BookingStatus;
	}


	public Cab getRequestCab() {
		return RequestCab;
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


	public void setCarType(String carType) {
		this.carType = carType;
	}


	public void setCabStatus(String cabStatus) {
		CabStatus = cabStatus;
	}


	public void setBookingStatus(String bookingStatus) {
		BookingStatus = bookingStatus;
	}


	public void setRequestCab(Cab requestCab) {
		RequestCab = requestCab;
	}


	private float distanceInKm;
	private String carType;
	private String CabStatus;
	private String BookingStatus;
	
	
	@JsonIgnore
	private Cab RequestCab;

	
}
