package com;

public class Destornillador {

	String forma;
	double tamaño;
	int cantidad;

	public Destornillador() {

	}

	public Destornillador(String forma, double tamaño, int cantidad) {

		this.forma = forma;
		this.tamaño = tamaño;
		this.cantidad = cantidad;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Destornillador [forma=" + forma + ", tamaño=" + tamaño + ", cantidad=" + cantidad + "]";
	}

}