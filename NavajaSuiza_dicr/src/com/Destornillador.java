package com;

public class Destornillador {

	String forma;
	int cantidad;
	double tamaño;
	
	public Destornillador () {
		
	}

	public Destornillador(String forma, int cantidad, double tamaño) {

		this.forma = forma;
		this.cantidad = cantidad;
		this.tamaño = tamaño;
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

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Destornillador [forma=" + forma + ", cantidad=" + cantidad + ", tamaño=" + tamaño + "]";
	}
	
	
}
