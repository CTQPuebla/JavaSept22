package com;

public class Persona {
	
	// Atributos
	
	String colordepiel,nombre,ciudadania,sexo;
	int edad;
	
	public Persona(String colordepiel, String nombre, String ciudadania, String sexo, int edad) {
		
		this.colordepiel = colordepiel;
		this.nombre = nombre;
		this.ciudadania = ciudadania;
		this.sexo = sexo;
		this.edad = edad;
	}
	public String getColordepiel() {
		return colordepiel;
	}
	public void setColordepiel(String colordepiel) {
		this.colordepiel = colordepiel;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudadania() {
		return ciudadania;
	}
	public void setCiudadania(String ciudadania) {
		this.ciudadania = ciudadania;
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
		return "Persona [colordepiel=" + colordepiel + ", nombre=" + nombre + ", ciudadania=" + ciudadania + ", sexo="
				+ sexo + ", edad=" + edad + "]";
	}
	
	
	
	
	
	
	

}//class
