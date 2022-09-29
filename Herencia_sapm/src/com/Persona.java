package com;

public class Persona {
	
	String ColorPiel,Edad,Nombre,Sexo,Ciudadania;
	
	public Persona() {
		
	}
	
	

	public Persona(String colorPiel, String edad, String nombre, String sexo, String ciudadania) {
		ColorPiel = colorPiel;
		Edad = edad;
		Nombre = nombre;
		Sexo = sexo;
		Ciudadania = ciudadania;
	}



	public String getColorPiel() {
		return ColorPiel;
	}

	public void setColorPiel(String colorPiel) {
		ColorPiel = colorPiel;
	}

	public String getEdad() {
		return Edad;
	}

	public void setEdad(String edad) {
		Edad = edad;
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

	@Override
	public String toString() {
		return "Persona [ColorPiel=" + ColorPiel + ", Edad=" + Edad + ", Nombre=" + Nombre + ", Sexo=" + Sexo
				+ ", Ciudadania=" + Ciudadania + "]";
	}
	
	
	
	

}
