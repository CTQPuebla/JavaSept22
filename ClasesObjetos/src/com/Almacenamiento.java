package com;

public class Almacenamiento {
	
	String fabricante;
	int capacidad;
	
	public Almacenamiento() {
	
	}

	public Almacenamiento(String fabricante, int capacidad) {
		this.fabricante = fabricante;
		this.capacidad = capacidad;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Almacenamiento [fabricante=" + fabricante + ", capacidad=" + capacidad + "]";
	}
	
}
