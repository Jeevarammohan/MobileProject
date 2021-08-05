package com.mobileapp.model;

public class Mobile {
	private int mobileId;
	private String model;
	private String brand;
	private double price;

	public Mobile(int mobileId, String model, String brand, double price) {
		super();
		this.mobileId = mobileId;
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	@Override
	public String toString() {
		return "mobileId=" + mobileId + ", model=" + model + ", brand=" + brand + ", price=" + price;
	}

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
