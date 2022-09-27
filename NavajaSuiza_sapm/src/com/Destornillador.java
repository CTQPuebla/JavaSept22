package com;

public class Destornillador {

	String forma;
	double tama�o;
	int cantidad;

	public Destornillador() {

	}

	public Destornillador(String forma, double tama�o, int cantidad) {

		this.forma = forma;
		this.tama�o = tama�o;
		this.cantidad = cantidad;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Destornillador [forma=" + forma + ", tama�o=" + tama�o + ", cantidad=" + cantidad + "]";
	}

}