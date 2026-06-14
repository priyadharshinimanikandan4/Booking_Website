package com.example.Booking_Website.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Booking_Website.entity.User;
import com.example.Booking_Website.repo.Repo;

@Service
public class service {

	@Autowired
	private Repo r;
	
	public List<User>getAllUsers(){
		return r.findAll();
		
	}
	
	public User createuser( User u){
		return r.save(u);
		
	}
	
	
	
	public User updateuser( Long id, User update ){
		
		 User u = r.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
		 
		 u.setName(update.getName());
		 u.setSource(update.getSource());
		 u.setDestination(update.getDestination());
		 u.setDate(update.getDate());
		 u.setPrice(update.getPrice());
		 u.setSeattype(update.getSeattype());
		 
		 
		return r.save(u);
		
	}
	
	public void deleteuser(Long id){
		r.deleteById(id);
		
	}
	
	
}
