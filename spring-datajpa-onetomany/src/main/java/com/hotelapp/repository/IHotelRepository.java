package com.hotelapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelapp.model.Hotel;


@Repository
public interface IHotelRepository extends JpaRepository<Hotel,Integer>{
	
	
	List<Hotel> findByCity(String city);
	List<Hotel> findByType(String type);
	List<Hotel> findByRating(double rating);
}
