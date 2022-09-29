package com;

public abstract class Figura {

	String nombre;
	
	Figura (){
		
	}

	public Figura(String nombre) {
		
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
		return "PrincipalFigura [nombre=" + nombre + "]";
	}

	public abstract  double perimetro();
	
}


