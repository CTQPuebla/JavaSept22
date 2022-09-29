package com;

public class Extras {

	String nombre;
	String tamaño;
	int cantidad;
	
	public Extras() {
		
	}

	public Extras(String nombre, String tamaño, int cantidad) {
		this.nombre = nombre;
		this.tamaño = tamaño;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
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
		return "Extras [nombre=" + nombre + ", tamaño=" + tamaño + ", cantidad=" + cantidad + "]";
	}
	
}
