package com;

public class Persona {
	
	String colorpiel, nombre, sexo, ciudadania;
	int edad;
	

	public Persona(String colorpiel, String nombre, String sexo, String ciudadania, int edad) {
		//super();
		this.colorpiel = colorpiel;
		this.nombre = nombre;
		this.sexo = sexo;
		this.ciudadania = ciudadania;
		this.edad = edad;
	}

	public String getColorpiel() {
		return colorpiel;
	}

	public void setColorpiel(String colorpiel) {
		this.colorpiel = colorpiel;
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
		return "Persona [colorpiel=" + colorpiel + ", nombre=" + nombre + ", sexo=" + sexo + ", ciudadania="
				+ ciudadania + ", edad=" + edad + "]";
	}
	
	public void ImprimirMensaje() {
		System.out.println("Impresion desde la clase Persona");
	}
}
