package com;

public class Abrebotellas {

	double tama�o, ancho;
	String color;
	
	public Abrebotellas() {
		
	}
	
	public Abrebotellas(double tama�o, double ancho, String color) {
		super();
		this.tama�o = tama�o;
		this.ancho = ancho;
		this.color = color;
	}

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
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
		return "Abrebotellas [tama�o=" + tama�o + ", ancho=" + ancho + ", color=" + color + "]";
	}
	
	

}
