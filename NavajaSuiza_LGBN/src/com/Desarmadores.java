package com;

public class Desarmadores {
	
	String tipo;
	String tamaño;
	int cant;
	
	public Desarmadores () {
		
	}

	public Desarmadores(String tipo, String tamaño, int cant) {
		this.tipo = tipo;
		this.tamaño = tamaño;
		this.cant = cant;
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

	public int getCant() {
		return cant;
	}

	public void setCant(int cant) {
		this.cant = cant;
	}

	@Override
	public String toString() {
		return "Desarmadores [tipo=" + tipo + ", tamaño=" + tamaño + ", cant=" + cant + "]";
	}
	

}
