package com.hotelapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Item {
	@Id
	@GeneratedValue(generator="item_gen",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="item_gen",sequenceName="item_sequence",initialValue=1,allocationSize=1)
	private Integer itemId;
	
	@Column(name="itemname",length=20)
	private String itemName;
	
	@Column(name="category",length=20)
	@Enumerated(EnumType.STRING)
	private String category;
	

	@Column(length=20)
	private String cuisine;
	
	@Column(name="itemtype",length=20)
	@Enumerated(EnumType.STRING)
	private Type itemtype;
	private double price;
	
	

	public Item(String itemName, String category, String cuisine, Type itemtype, double price) {
		super();
		this.itemName = itemName;
		this.category = category;
		this.cuisine = cuisine;
		this.itemtype = itemtype;
		this.price = price;
	}



	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public Type getItemtype() {
		return itemtype;
	}

	public void setItemtype(Type itemtype) {
		this.itemtype = itemtype;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", category=" + category + ", cuisine=" + cuisine
				+ ", itemtype=" + itemtype + ", price=" + price + "]";
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
