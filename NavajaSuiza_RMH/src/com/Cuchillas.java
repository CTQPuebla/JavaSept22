package com;

public class Cuchillas {
	
	String material;
	double tama�o;
	
	public Cuchillas() {
		
	}

	public Cuchillas(String material, double tama�o) {
		//super();
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
		return "Cuchillas [material=" + material + ", tama�o=" + tama�o + "]";
	}
	
	

}
