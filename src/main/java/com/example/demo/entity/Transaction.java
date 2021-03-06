package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaction {

	@Id
	private Integer transactionId;
	private LocalDateTime bookedDate;
	private Integer odcId;
	private Integer bookedSeats;
	
	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public LocalDateTime getBookedDate() {
		return bookedDate;
	}
	public void setBookedDate(LocalDateTime bookedDate) {
		this.bookedDate = bookedDate;
	}
	public Integer getOdcId() {
		return odcId;
	}
	public void setOdcId(Integer odcId) {
		this.odcId = odcId;
	}
	
	public Integer getBookedSeats() {
		return bookedSeats;
	}
	public void setBookedSeats(Integer bookedSeats) {
		this.bookedSeats = bookedSeats;
	}
	
	
	
	
	
}
