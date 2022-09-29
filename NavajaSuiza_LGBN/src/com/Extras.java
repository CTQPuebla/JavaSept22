package com;

public class Extras {

	String nombre;
	String tama�o;
	int cantidad;
	
	public Extras() {
		
	}

	public Extras(String nombre, String tama�o, int cantidad) {
		this.nombre = nombre;
		this.tama�o = tama�o;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
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
		return "Extras [nombre=" + nombre + ", tama�o=" + tama�o + ", cantidad=" + cantidad + "]";
	}
	
}
