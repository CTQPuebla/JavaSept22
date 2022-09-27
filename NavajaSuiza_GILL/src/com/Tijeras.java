package com;

public class Tijeras {
	String odelo,marca;
	
	
	public Tijeras() {// constructor por default
		
	}


	public Tijeras(String odelo, String marca) {
		
		this.odelo = odelo;
		this.marca = marca;
	}


	public String getOdelo() {
		return odelo;
	}


	public void setOdelo(String odelo) {
		this.odelo = odelo;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	@Override
	public String toString() {
		return "Tijeras [odelo=" + odelo + ", marca=" + marca + "]";
	}


	

}
