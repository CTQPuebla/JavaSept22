package com;

public class Persona {
	
	public Persona () {
	}
	
	
//Atributos
	String Colordepiel, Nombre, sexo, ciudadania;
    int Edad;
	public Persona(String colordepiel, String nombre, String sexo, String ciudadania, int edad) {
		super();
		Colordepiel = colordepiel;
		Nombre = nombre;
		this.sexo = sexo;
		this.ciudadania = ciudadania;
		Edad = edad;
	}
	public String getColordepiel() {
		return Colordepiel;
	}
	public void setColordepiel(String colordepiel) {
		Colordepiel = colordepiel;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCiudadania() {
		return ciudadania;
	}
	public void setCiudadania(String ciudadania) {
		this.ciudadania = ciudadania;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [Colordepiel=" + Colordepiel + ", Nombre=" + Nombre + ", sexo=" + sexo + ", ciudadania="
				+ ciudadania + ", Edad=" + Edad + "]";
	}
   
    
 
	
}
