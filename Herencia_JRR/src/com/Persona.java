package com;

public class Persona {
	private String colorPiel;
	private int edad;
	private String nombre;
	private String sexo;
	private String ciudadania;

	public Persona() {
	}

	public Persona(String colorPiel, int edad, String nombre, String sexo, String ciudadania) {
		this.colorPiel = colorPiel;
		this.edad = edad;
		this.nombre = nombre;
		this.sexo = sexo;
		this.ciudadania = ciudadania;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
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
		return "Persona [colorPiel=" + colorPiel + ", edad=" + edad + ", nombre=" + nombre + ", sexo=" + sexo
				+ ", ciudadania=" + ciudadania + "]";
	}

}
