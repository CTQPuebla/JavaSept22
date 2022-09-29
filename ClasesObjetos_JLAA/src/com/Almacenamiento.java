package com;

public class Almacenamiento {
	int capacidad;
	String fabricante;
	
	public Almacenamiento () {
		
		
		
	}

	public Almacenamiento(int capacidad, String fabricante) {
	
		this.capacidad = capacidad;
		this.fabricante = fabricante;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Almacenamiento [capacidad=" + capacidad + ", fabricante=" + fabricante + "]";
	}
	
	

}
