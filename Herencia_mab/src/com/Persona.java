package com;

public class Persona {

	String ColorPiel;
	String Nombre;
	String Sexo;
	String Ciudadania;
	int Edad;
	
	public Persona() {
		
	}

	public Persona(String colorPiel, String nombre, String sexo, String ciudadania, int edad) {
		super();
		ColorPiel = colorPiel;
		Nombre = nombre;
		Sexo = sexo;
		Ciudadania = ciudadania;
		Edad = edad;
	}

	public String getColorPiel() {
		return ColorPiel;
	}

	public void setColorPiel(String colorPiel) {
		ColorPiel = colorPiel;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	public String getCiudadania() {
		return Ciudadania;
	}

	public void setCiudadania(String ciudadania) {
		Ciudadania = ciudadania;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [ColorPiel=" + ColorPiel + ", Nombre=" + Nombre + ", Sexo=" + Sexo + ", Ciudadania="
				+ Ciudadania + ", Edad=" + Edad + "]";
	}
	
	
}
