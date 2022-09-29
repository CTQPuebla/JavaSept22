package com;

public class PelaCables {
	
	double largo;
	double ancho;
	String tipo;
	
	PelaCables (){
		
	}

	public PelaCables(double largo, double ancho, String tipo) {
		super();
		this.largo = largo;
		this.ancho = ancho;
		this.tipo = tipo;
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "PelaCables [largo=" + largo + ", ancho=" + ancho + ", tipo=" + tipo + "]";
	}
	
	

}
