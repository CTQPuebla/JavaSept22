package com;

public class Regla {

	double tama�o;
	double ancho;
	double largo;
	
	public Regla () {
		
	}

	public Regla(double tama�o, double ancho, double largo) {
		super();
		this.tama�o = tama�o;
		this.ancho = ancho;
		this.largo = largo;
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

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	@Override
	public String toString() {
		return "Regla [tama�o=" + tama�o + ", ancho=" + ancho + ", largo=" + largo + "]";
	}
	
	
}
