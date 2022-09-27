package com;

public class Cortantes {

	String tipo;
	String tama�o;
	int cantidad;
	
	public Cortantes() {
		
	}

	public Cortantes(String tipo, String tama�o, int cantidad) {
		this.tipo = tipo;
		this.tama�o = tama�o;
		this.cantidad = cantidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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
		return "Cortantes [tipo=" + tipo + ", tama�o=" + tama�o + ", cantidad=" + cantidad + "]";
	}
	
}
