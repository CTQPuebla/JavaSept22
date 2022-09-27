package com;

public class lima {

	double largo;
	double ancho;
	String material;
	
	public lima() {
		
	}

	public lima(double largo, double ancho, String material) {
		super();
		this.largo = largo;
		this.ancho = ancho;
		this.material = material;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "lima [largo=" + largo + ", ancho=" + ancho + ", material=" + material + "]";
	}
	
}
