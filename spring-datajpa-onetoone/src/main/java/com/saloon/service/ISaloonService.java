package com.saloon.service;

import java.util.List;

import com.saloon.model.Saloon;

public interface ISaloonService {
	void addSaloon(Saloon saloon);
	void updateSaloon(Saloon saloon);
	void deleteSaloon(Saloon saloon);
	Saloon getById(int studentId);
	List<Saloon> getAll();
	
	
	List<Saloon> getByName(String name);
	List<Saloon> getByCity(String city);
	
}
