package com;

public class Destornillador {
	// Tipo de cabeza, plana, cruz, hexagonal, etc.
	String tipoCabeza;
	double tamaño;

	public Destornillador() {
	}

	public Destornillador(String tipoCabeza, double tamaño) {
		this.tipoCabeza = tipoCabeza;
		this.tamaño = tamaño;
	}

	public String getTipoCabeza() {
		return tipoCabeza;
	}

	public void setTipoCabeza(String tipoCabeza) {
		this.tipoCabeza = tipoCabeza;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Destornillador [tipoCabeza=" + tipoCabeza + ", tamaño=" + tamaño + "]";
	}

}
