package com.saloon.model;

import javax.persistence.*;

@Entity
public class Saloon {
	
	
	@Id
	@GeneratedValue(generator="saloon_gen",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="saloon_gen",initialValue=1,allocationSize=1)
	private int saloonId;
	@Column(length=50)
	private String name;
	private String city;
	
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name="details_id")
	private Details details;
	
	
	public Saloon() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Saloon(String name, String city, Details details) {
		super();
		this.name = name;
		this.city = city;
		this.details = details;
	}


	public int getSaloonId() {
		return saloonId;
	}


	public void setSaloonId(int saloonId) {
		this.saloonId = saloonId;
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


	public Details getDetails() {
		return details;
	}


	public void setDetails(Details details) {
		this.details = details;
	}


	@Override
	public String toString() {
		return "Saloon [saloonId=" + saloonId + ", name=" + name + ", city=" + city + ", details=" + details + "]";
	}
	
}
