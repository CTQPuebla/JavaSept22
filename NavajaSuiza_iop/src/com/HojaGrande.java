package com;

public class HojaGrande {
	
	String material;
	double tamaño;
	
	public HojaGrande() {
		
	}

	public HojaGrande(String material, double tamaño) {
		super();
		this.material = material;
		this.tamaño = tamaño;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "HojaGrande [material=" + material + ", tamaño=" + tamaño + "]";
	}
	
	
	
}
