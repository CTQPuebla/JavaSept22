package com;

public class Pinzas {
	String tipo;
	String funcion;
	
	
	public Pinzas() {
		
	}


	public Pinzas(String tipo, String funcion) {
	
		this.tipo = tipo;
		this.funcion = funcion;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getFuncion() {
		return funcion;
	}


	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}


	@Override
	public String toString() {
		return "Pinzas [tipo=" + tipo + ", funcion=" + funcion + "]";
	}
	
	
}
