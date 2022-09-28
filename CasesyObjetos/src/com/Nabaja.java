package com;

public class Nabaja {

	
	String material;
	int piesas;
	String color;
	double largo;
	double ancho;
	
	public Nabaja() {
	}

	public Nabaja(String material, int piesas, String color, double largo, double ancho) {
	
		this.material = material;
		this.piesas = piesas;
		this.color = color;
		this.largo = largo;
		this.ancho = ancho;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getPiesas() {
		return piesas;
	}

	public void setPiesas(int piesas) {
		this.piesas = piesas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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

	@Override
	public String toString() {
		return "Nabaja [material=" + material + ", piesas=" + piesas + ", color=" + color + ", largo=" + largo
				+ ", ancho=" + ancho + "]";
	}
	
	
	
	
	
	}
	
	

