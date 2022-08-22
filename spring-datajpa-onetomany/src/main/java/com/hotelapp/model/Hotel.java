package com.hotelapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Hotel {
	
	
	@Id
	@GeneratedValue(generator="hotel_gen",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="hotel_gen",sequenceName="hotel_sequence",initialValue=1,allocationSize=1)
	@Column(name="hotelid")
	private Integer hotelId;
	
	@Column(length=20)
	private String name;
	
	@Column(length=20)
	@Enumerated(value=EnumType.STRING)
	private String type;
	
	@Column(length=20)
	private String city ;
	
	private double rating;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="hotel_id")
	private Set<Item> itemList;

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Hotel(String name, String type, String city, double rating, Set<Item> itemList) {
		super();
		this.name = name;
		this.type = type;
		this.city = city;
		this.rating = rating;
		this.itemList = itemList;
	}


	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Set<Item> getItemList() {
		return itemList;
	}

	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public void setItemList(Set<Item> itemList) {
		this.itemList = itemList;
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", name=" + name + ", city=" + city + ", rating=" + rating + ", itemList="
				+ itemList + "]";
	}
	
	
	
}