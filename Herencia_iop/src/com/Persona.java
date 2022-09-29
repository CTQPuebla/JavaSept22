package com;

public class Persona {
	
	String colordepiel, edad, nombre, sexo, ciudadania;
	
	public Persona() {
		
	}

	public Persona(String colordepiel, String edad, String nombre, String sexo, String ciudadania) {
		super();
		this.colordepiel = colordepiel;
		this.edad = edad;
		this.nombre = nombre;
		this.sexo = sexo;
		this.ciudadania = ciudadania;
	}

	public String getColordepiel() {
		return colordepiel;
	}

	public void setColordepiel(String colordepiel) {
		this.colordepiel = colordepiel;
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

	public String getCiudadania() {
		return ciudadania;
	}

	public void setCiudadania(String ciudadania) {
		this.ciudadania = ciudadania;
	}

	@Override
	public String toString() {
		return "Persona [colordepiel=" + colordepiel + ", edad=" + edad + ", nombre=" + nombre + ", sexo=" + sexo
				+ ", ciudadania=" + ciudadania + "]";
	}
	
	
}
