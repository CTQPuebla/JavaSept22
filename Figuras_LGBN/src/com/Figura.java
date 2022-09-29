package com;

public abstract class Figura {
	String nombre;
	
	public Figura () {
		
	}
	

	public Figura(String nombre) {
		super();
		this.nombre = nombre;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Figura [nombre=" + nombre + "]";
	}

	public abstract double perimetro();
	
}
