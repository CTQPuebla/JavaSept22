package com;

public class Tijeras {

	

	double tama�o;
	double ancho;
	String Material;
	
	public Tijeras () {
		
	}

	public Tijeras(double tama�o, double ancho, String material) {
		super();
		this.tama�o = tama�o;
		this.ancho = ancho;
		Material = material;
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

	public String getMaterial() {
		return Material;
	}

	public void setMaterial(String material) {
		Material = material;
	}

	@Override
	public String toString() {
		return "Tijeras [tama�o=" + tama�o + ", ancho=" + ancho + ", Material=" + Material + "]";
	}
	
	
}
