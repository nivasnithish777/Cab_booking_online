package com.cab.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TripBookingDTO {

	private Integer tripBookingId;
	
	private String pickupLocation;
	private String fromDateTime;
	private String dropLocation;
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

	public String getTripStatus() {
		return TripStatus;
	}

	public String getDriverName() {
		return driverName;
	}

	public String getLicenceNo() {
		return licenceNo;
	}

	public float getRating() {
		return rating;
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

	public float getFare() {
		return fare;
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

	public void setTripStatus(String tripStatus) {
		TripStatus = tripStatus;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}

	public void setRating(float rating) {
		this.rating = rating;
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

	public void setFare(float fare) {
		this.fare = fare;
	}

	private String toDateTime;
	private float distanceInKm;
	private String TripStatus;
	
	private String driverName;
	private String licenceNo;
	private float rating; 
	
	private String carType;
	private String carName;
	private String carNumber;
	private float perKmRate;
	
	private float fare;
}
