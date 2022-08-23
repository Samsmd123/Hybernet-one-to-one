package com.hotelapp.service;

import java.util.List;

import com.hotelapp.model.Category;
import com.hotelapp.model.Hotel;
import com.hotelapp.model.Type;

public interface IHotelService {
	void addHotel(Hotel hotel);
	void updateHotel(Hotel hotel);
	void deleteHotel(Hotel hotel);
	List<Hotel> getALL();
	Hotel getById(int hotelId);
	
	
	//DERIVED QUERIES
	List<Hotel> getByCity(String city);
	List<Hotel> getByType(Type type);
	List<Hotel> getByRating(double rating);
	
	
	//CUSTOM QUERIES
	List<Hotel> getByItemName(String itemName);
	List<Hotel> getByItemNameCategory(String itemName,Category category);
	List<Hotel> getByCuisine(String cuisine);
	List<Hotel> getByCategory(Category category);
	List<Hotel> getByCuisineAndType(String cuisine,Type type);
	List<Hotel> getByItemNameLessPrice(String itemName,double  price);

}
