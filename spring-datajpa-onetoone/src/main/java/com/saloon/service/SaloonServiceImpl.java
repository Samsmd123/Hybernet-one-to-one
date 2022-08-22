package com.saloon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saloon.model.Saloon;
import com.saloon.repository.ISaloonRepository;
@Service
public class SaloonServiceImpl implements  ISaloonService{
	@Autowired
	ISaloonRepository saloonRepository;

	@Override
	public void addSaloon(Saloon saloon) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateSaloon(Saloon saloon) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteSaloon(Saloon saloon) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Saloon getById(int studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Saloon> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Saloon> getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Saloon> getByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

}
