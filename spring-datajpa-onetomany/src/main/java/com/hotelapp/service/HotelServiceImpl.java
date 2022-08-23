package com.hotelapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.model.Category;
import com.hotelapp.model.Hotel;
import com.hotelapp.model.Type;
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
		return hotelRepository.findAll();
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

	public List<Hotel> getByType(Type type) {
		// TODO Auto-generated method stub
		return hotelRepository.findByType(type);
	}

	@Override
	public List<Hotel> getByRating(double rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getByItemName(String itemName) {
	
		return hotelRepository.findByItemName(itemName);
	}

	public List<Hotel> getByItemNameCategory(String itemName, Category category) {
		
		return hotelRepository.findByItemNameCategory(itemName, category);
	}

	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		
		return hotelRepository.findByCuisine(cuisine);
	}

	
	public List<Hotel> getByCategory(Category category) {
		
		return hotelRepository.findByCategory(category);
	}

	
	public List<Hotel> getByCuisineAndType(String cuisine,Type type) {
		
		return hotelRepository.findByCuisineAndType(cuisine, type);
	}

	
	@Override
	public List<Hotel> getByItemNameLessPrice(String itemName, double price) {
		
		return hotelRepository.findByItemNameLessPrice(itemName, price);
	}

	
	

}
