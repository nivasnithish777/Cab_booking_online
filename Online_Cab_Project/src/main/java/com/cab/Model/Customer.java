package com.cab.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="customers")
public class Customer extends User{

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length=10, nullable = false)
	private Integer customerId;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	@JsonIgnore
	private List<TripBooking> tripBooking;

	public Integer getCustomerId() {
		return customerId;
	}

	public List<TripBooking> getTripBooking() {
		return tripBooking;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public void setTripBooking(List<TripBooking> tripBooking) {
		this.tripBooking = tripBooking;
	}
	
	
	
	
}
