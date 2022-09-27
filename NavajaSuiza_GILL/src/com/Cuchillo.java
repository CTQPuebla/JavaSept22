package com;

public class Cuchillo {
	
	String modelo,tipo;
	
	// constructor por default
	public Cuchillo() {
		
	}

	public Cuchillo(String modelo, String tipo) {
		
		this.modelo = modelo;
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Cuchillo [modelo=" + modelo + ", tipo=" + tipo + "]";
	}
		
	
	

}//class
