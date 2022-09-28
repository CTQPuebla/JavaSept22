package com;

public class Almasenamiento {

	
	String fabricante;
	int capacidad;
	
	
	public Almasenamiento() {
	
	

}

	public Almasenamiento(String fabricante, int capacidad) {
		
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
		return "Almasenamiento [fabricante=" + fabricante + ", capacidad=" + capacidad + "]";
	}
	
	
	
	
	
	
	
}
