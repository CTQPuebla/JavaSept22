package com;

public class Persona {
	
	String colorpiel,nombre,sexo;
	int edad;
	


	public Persona(String colorpiel, String nombre, String sexo, int edad) {
		//super();
		this.colorpiel = colorpiel;
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
	}

	public String getColorpiel() {
		return colorpiel;
	}

	public void setColorpiel(String colorpiel) {
		this.colorpiel = colorpiel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [colorpiel=" + colorpiel + ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + "]";
	}
	
	

}
