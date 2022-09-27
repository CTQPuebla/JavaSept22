package com;

public class Abrelatas {

	String material;
	double tama�o;
	
	public Abrelatas() {
		
	}

	public Abrelatas(String material, double tama�o) {
		super();
		this.material = material;
		this.tama�o = tama�o;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Abrelatas [material=" + material + ", tama�o=" + tama�o + "]";
	}
	
}
