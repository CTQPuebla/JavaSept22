package com;

public abstract class Figuras {
	
	String nombre;
	
	public Figuras () {
		
	}

	public Figuras(String nombre) {
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
		return "Figuras [nombre=" + nombre + "]";
	}
	
	public abstract double perimetro ();
	

}
