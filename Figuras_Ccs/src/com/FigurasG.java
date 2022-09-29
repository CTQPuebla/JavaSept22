package com;

public abstract class FigurasG {
	
	String nombre;
	
	public FigurasG() {
		
	}

	public FigurasG(String nombre) {
	
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
		return "FigurasG [nombre=" + nombre + "]";
	}
	
	public abstract double perimetro();
}
