package com;

public class Destornillador {
	String plano;
	double largo;
	
	// constructor por default
	public Destornillador() {
		
	}

	public Destornillador(String plano, double largo) {
		
		this.plano = plano;
		this.largo = largo;
	}

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	@Override
	public String toString() {
		return "Destornillador [plano=" + plano + ", largo=" + largo + "]";
	}

}// class
