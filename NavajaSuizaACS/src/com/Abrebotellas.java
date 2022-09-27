package com;

public class Abrebotellas {

	double tamaño, ancho;
	String color;
	
	public Abrebotellas() {
		
	}
	
	public Abrebotellas(double tamaño, double ancho, String color) {
		super();
		this.tamaño = tamaño;
		this.ancho = ancho;
		this.color = color;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Abrebotellas [tamaño=" + tamaño + ", ancho=" + ancho + ", color=" + color + "]";
	}
	
	

}
