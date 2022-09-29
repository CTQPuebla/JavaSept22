package com;

public class Tijeras {

	

	double tamaño;
	double ancho;
	String Material;
	
	public Tijeras () {
		
	}

	public Tijeras(double tamaño, double ancho, String material) {
		super();
		this.tamaño = tamaño;
		this.ancho = ancho;
		Material = material;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public String getMaterial() {
		return Material;
	}

	public void setMaterial(String material) {
		Material = material;
	}

	@Override
	public String toString() {
		return "Tijeras [tamaño=" + tamaño + ", ancho=" + ancho + ", Material=" + Material + "]";
	}
	
	
}
