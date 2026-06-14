package com.example.Booking_Website.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Booking_Website.entity.User;



@Repository
public interface Repo extends JpaRepository<User , Long > {

}
