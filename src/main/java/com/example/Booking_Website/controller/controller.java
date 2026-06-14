package com.example.Booking_Website.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Booking_Website.entity.User;
import com.example.Booking_Website.repo.Repo;
import com.example.Booking_Website.service.service;

@RestController
@RequestMapping("/api")
public class controller {

	@Autowired
	private service s;
	
	@GetMapping("/users")
	public ResponseEntity<List<User>>getAllUsers(){
		List<User> a = s.getAllUsers();
		return ResponseEntity.ok(a);
		
	}
	
	@PostMapping("/newusers")
	public ResponseEntity<User> createuser(@RequestBody User u){
		
		User user = s.createuser(u);
		return ResponseEntity.ok(user);
		
	}
	
	
	@PutMapping("/newusers/{id}")
	public ResponseEntity<User> updateuser(@PathVariable Long id,@RequestBody User u){
		User userr = s.updateuser(id, u);
		return ResponseEntity.ok(userr);
		
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<String> deleteuser(@PathVariable Long id){
		s.deleteuser(id);
		return ResponseEntity.ok("user deletd sucesfully");
		
	}
	
}
