package com.saloon.model;

import javax.persistence.*;

@Entity
public class Details {
	private int detailsId;
	private String type;
	private String brand;
	private double membershipFee;
	
	

	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Details( String type, String brand, double membershipFee) {
		super();
		
		this.type = type;
		this.brand = brand;
		this.membershipFee = membershipFee;
	}

	public int getDetailsId() {
		return detailsId;
	}

	public void setDetailsId(int detailsId) {
		this.detailsId = detailsId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getMembershipFee() {
		return membershipFee;
	}

	public void setMembershipFee(double membershipFee) {
		this.membershipFee = membershipFee;
	}

	@Override
	public String toString() {
		return "Details [detailsId=" + detailsId + ", type=" + type + ", brand=" + brand + ", membershipFee="
				+ membershipFee + "]";
	}
	

}
