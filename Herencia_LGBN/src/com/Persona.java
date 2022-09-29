package com;

public class Persona {
	
	String colorDePiel;
	int edad;
	String nombre;
	String sexo;
	String ciudadania;
	
	public Persona () {
		
	}

	public Persona(String colorDePiel, int edad, String nombre, String sexo, String ciudadania) {
		super();
		this.colorDePiel = colorDePiel;
		this.edad = edad;
		this.nombre = nombre;
		this.sexo = sexo;
		this.ciudadania = ciudadania;
	}

	public String getColorDePiel() {
		return colorDePiel;
	}

	public void setColorDePiel(String colorDePiel) {
		this.colorDePiel = colorDePiel;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
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

	public String getCiudadania() {
		return ciudadania;
	}

	public void setCiudadania(String ciudadania) {
		this.ciudadania = ciudadania;
	}

	@Override
	public String toString() {
		return "Persona [colorDePiel=" + colorDePiel + ", edad=" + edad + ", nombre=" + nombre + ", sexo=" + sexo
				+ ", ciudadania=" + ciudadania + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
