package com;

public class Destornillador {

	String forma;
	int cantidad;
	double tama�o;
	
	public Destornillador () {
		
	}

	public Destornillador(String forma, int cantidad, double tama�o) {

		this.forma = forma;
		this.cantidad = cantidad;
		this.tama�o = tama�o;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Destornillador [forma=" + forma + ", cantidad=" + cantidad + ", tama�o=" + tama�o + "]";
	}
	
	
}
