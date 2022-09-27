package com;

public class Desarmadores {
	
	String tipo;
	String tama�o;
	int cant;
	
	public Desarmadores () {
		
	}

	public Desarmadores(String tipo, String tama�o, int cant) {
		this.tipo = tipo;
		this.tama�o = tama�o;
		this.cant = cant;
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

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	@Override
	public String toString() {
		return "Desarmadores [tipo=" + tipo + ", tama�o=" + tama�o + ", cant=" + cant + "]";
	}
	

}
