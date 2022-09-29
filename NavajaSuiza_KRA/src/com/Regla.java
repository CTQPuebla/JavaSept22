package com;

public class Regla {

	double tamaño;
	double ancho;
	double largo;
	
	public Regla () {
		
	}

	public Regla(double tamaño, double ancho, double largo) {
		super();
		this.tamaño = tamaño;
		this.ancho = ancho;
		this.largo = largo;
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

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	@Override
	public String toString() {
		return "Regla [tamaño=" + tamaño + ", ancho=" + ancho + ", largo=" + largo + "]";
	}
	
	
}
