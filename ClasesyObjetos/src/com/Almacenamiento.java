package com;

public class Almacenamiento {

	
	String fabricante;
	int capacidad;
	
	public Almacenamiento () {
	
	}
	
	
	

	public Almacenamiento(String fabricante, int capacidad) {
		super();
		this.fabricante = fabricante;
		this.capacidad = capacidad;
	}




	@Override
	public String toString() {
		return "Almacenamiento [fabricante=" + fabricante + ", capacidad=" + capacidad + "]";
	}
}//publicclass
