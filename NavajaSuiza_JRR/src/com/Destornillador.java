package com;

public class Destornillador {
	// Tipo de cabeza, plana, cruz, hexagonal, etc.
	String tipoCabeza;
	double tama�o;

	public Destornillador() {
	}

	public Destornillador(String tipoCabeza, double tama�o) {
		this.tipoCabeza = tipoCabeza;
		this.tama�o = tama�o;
	}

	public String getTipoCabeza() {
		return tipoCabeza;
	}

	public void setTipoCabeza(String tipoCabeza) {
		this.tipoCabeza = tipoCabeza;
	}

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Destornillador [tipoCabeza=" + tipoCabeza + ", tama�o=" + tama�o + "]";
	}

}
