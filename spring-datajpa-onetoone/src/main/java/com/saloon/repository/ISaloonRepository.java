package com.saloon.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.saloon.model.Saloon;
@Repository
public interface ISaloonRepository {
	Saloon findById(int studentId);
	List<Saloon> findAll();
	
	
	List<Saloon> findByName(String name);
	List<Saloon> findByCity(String city);
	
}
