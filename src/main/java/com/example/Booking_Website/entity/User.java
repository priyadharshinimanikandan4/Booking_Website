package com.example.Booking_Website.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(max= 20)
private	String name;
	
	private String source;
	private String destination;
	 private LocalDate date;
	 private double price;
	 private String seattype;
	 
	
	
	 public Long getId() {
		 return id;
	 }
	 public String getName() {
		 return name;
	 }
	 public String getSource() {
		 return source;
	 }
	 public String getDestination() {
		 return destination;
	 }
	 public LocalDate getDate() {
		 return date;
	 }
	 public double getPrice() {
		 return price;
	 } 
	 public String getSeattype() {
		 return seattype;
	 } 
		
	 public void setId(long id) {
		 this.id = id;
	 }
	 public void setName(String name) {
		 this.name =  name;
	 }
	 public void setSource(String source) {
		 this.source =  source;
	 }
	 public void setDestination(String destination) {
		 this.destination = destination;
	 }
	 public void setDate(LocalDate date
			 ) {
		 this.date =  date;
	 }
	 public void setPrice(double price) {
		 this.price = price;
	 } 
	 public void setSeattype(String seattype) {
 this.seattype =  seattype;
	 } 
}

