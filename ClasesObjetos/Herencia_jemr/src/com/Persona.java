package com;

public class Persona {
	public static String atributoD = "VALOR";

	
	String colorPiel, nombre, sexo, ciudadania;
	int edad;
	
	public Persona(){
		
	}

	public Persona(String colorPiel, String nombre, String sexo, String ciudadania, int edad) {
		
		this.colorPiel = colorPiel;
		this.nombre = nombre;
		this.sexo = sexo;
		this.ciudadania = ciudadania;
		this.edad = edad;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [colorPiel=" + colorPiel + ", nombre=" + nombre + ", sexo=" + sexo + ", ciudadania="
				+ ciudadania + ", edad=" + edad + "]";
	}
	public void ImprimeMsg() {
		
	}
	

}
