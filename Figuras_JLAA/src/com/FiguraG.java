package com;

public abstract class FiguraG {
	
	String nombre;
	
	public FiguraG() {
		
	}

	public FiguraG(String nombre) {
		
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
		return "FiguraG [nombre=" + nombre + "]";
	}

	public abstract double perimetro ();

}
