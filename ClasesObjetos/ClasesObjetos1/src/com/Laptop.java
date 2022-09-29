package com;

public class Laptop {
	
	String brand, color, materials;
	double screenSize;
	int ssdiCap, ramCap;
	
	public Laptop() {
	
	}

	public Laptop(String brand, String color, String materials, double screenSize, int ssdiCap, int ramCap) {
		super();
		this.brand = brand;
		this.color = color;
		this.materials = materials;
		this.screenSize = screenSize;
		this.ssdiCap = ssdiCap;
		this.ramCap = ramCap;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterials() {
		return materials;
	}

	public void setMaterials(String materials) {
		this.materials = materials;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}

	public int getSsdiCap() {
		return ssdiCap;
	}

	public void setSsdiCap(int ssdiCap) {
		this.ssdiCap = ssdiCap;
	}

	public int getRamCap() {
		return ramCap;
	}

	public void setRamCap(int ramCap) {
		this.ramCap = ramCap;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", color=" + color + ", materials=" + materials + ", screenSize=" + screenSize
				+ ", ssdiCap=" + ssdiCap + ", ramCap=" + ramCap + "]";
	}

}
