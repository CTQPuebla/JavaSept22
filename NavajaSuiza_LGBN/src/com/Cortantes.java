package com;

public class Cortantes {

	String tipo;
	String tamaño;
	int cantidad;
	
	public Cortantes() {
		
	}

	public Cortantes(String tipo, String tamaño, int cantidad) {
		this.tipo = tipo;
		this.tamaño = tamaño;
		this.cantidad = cantidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
		return "Cortantes [tipo=" + tipo + ", tamaño=" + tamaño + ", cantidad=" + cantidad + "]";
	}
	
}
