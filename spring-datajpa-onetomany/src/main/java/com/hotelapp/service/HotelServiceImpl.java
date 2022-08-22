package com.hotelapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.model.Hotel;
import com.hotelapp.repository.IHotelRepository;

@Service
public class HotelServiceImpl implements IHotelService {

	@Autowired
	IHotelRepository hotelRepository;
	
	
	public void setHotelRepository(IHotelRepository hotelRepository) {
		this.hotelRepository = hotelRepository;
	}

	@Override
	public void addHotel(Hotel hotel) {
		hotelRepository.save(hotel);
		
	}

	@Override
	public void updateHotel(Hotel hotel) {
		hotelRepository.save(hotel);
		
	}

	@Override
	public void deleteHotel(Hotel hotel) {
		hotelRepository.save(hotel);
		
	}

	@Override
	public List<Hotel> getALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hotel getById(int hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getByRating(double rating) {
		// TODO Auto-generated method stub
		return null;
	}

}
