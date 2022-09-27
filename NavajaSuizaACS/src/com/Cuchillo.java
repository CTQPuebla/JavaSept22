package com;

public class Cuchillo {

	double tamaño, ancho;
	
	public Cuchillo() {
		
	}
	
	public Cuchillo(double tamaño, double ancho) {
		super();
		this.tamaño = tamaño;
		this.ancho = ancho;
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

	@Override
	public String toString() {
		return "Cuchillo [tamaño=" + tamaño + ", ancho=" + ancho + "]";
	}
	
}
