package com.example.demo.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserTransaction {

	@Id
	private Integer userTransactionId;
	private Integer headerId;
	private Integer transactionid;
	private Integer bookedSeat;
	private LocalDateTime dateCreated;
	public Integer getUserTransactionId() {
		return userTransactionId;
	}
	public void setUserTransactionId(Integer userTransactionId) {
		this.userTransactionId = userTransactionId;
	}
	public Integer getHeaderId() {
		return headerId;
	}
	public void setHeaderId(Integer headerId) {
		this.headerId = headerId;
	}
	public Integer getTransactionid() {
		return transactionid;
	}
	public void setTransactionid(Integer transactionid) {
		this.transactionid = transactionid;
	}
	public Integer getBookedSeat() {
		return bookedSeat;
	}
	public void setBookedSeat(Integer bookedSeat) {
		this.bookedSeat = bookedSeat;
	}
	public LocalDateTime getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	
	
	
}
