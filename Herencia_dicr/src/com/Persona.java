package com;

public class Persona {
	String ColorPiel;
	int edad;
	String nombre;
	String sexo;
	String ciudadania;
	
	
    public Persona() {
		
	}


	public Persona(String colorPiel, int edad, String nombre, String sexo, String ciudadania) {
		super();
		ColorPiel = colorPiel;
		this.edad = edad;
		this.nombre = nombre;
		this.sexo = sexo;
		this.ciudadania = ciudadania;
	}


	public String getColorPiel() {
		return ColorPiel;
	}


	public void setColorPiel(String colorPiel) {
		ColorPiel = colorPiel;
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
		return "Persona [ColorPiel=" + ColorPiel + ", edad=" + edad + ", nombre=" + nombre + ", sexo=" + sexo
				+ ", ciudadania=" + ciudadania + "]";
	}
    
    
     
}
