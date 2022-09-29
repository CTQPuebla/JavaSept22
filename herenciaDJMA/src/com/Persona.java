package com;

public class Persona {

	
	String color, edad, nombre, sexo;
	
	public Persona() {
		
	}

	public Persona(String color, String edad, String nombre, String sexo) {
	
		this.color = color;
		this.edad = edad;
		this.nombre = nombre;
		this.sexo = sexo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
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

	@Override
	public String toString() {
		return "Persona [color=" + color + ", edad=" + edad + ", nombre=" + nombre + ", sexo=" + sexo + "]";
	}
	
}
