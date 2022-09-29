package com;

public abstract class Figuras {

	String nombre;
	
	//return 1.33*(Math.pow(radio,3)));
	
	public Figuras() {
		
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		return "Figuras [nombre=" + nombre + "]";
	}

	//Metodo Abstracto
	public abstract double perimetro();
	
	
}
