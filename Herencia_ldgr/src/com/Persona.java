package com;

public class Persona {
	
	System colordepiel;
	int edad;
	System Nombre;
	System sexo;
	
	public Persona(); {
		
	}

	public Persona(System colordepiel, int edad, System nombre, System sexo) {
		super();
		this.colordepiel = colordepiel;
		this.edad = edad;
		Nombre = nombre;
		this.sexo = sexo;
	}

	public System getColordepiel() {
		return colordepiel;
	}

	public void setColordepiel(System colordepiel) {
		this.colordepiel = colordepiel;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public System getNombre() {
		return Nombre;
	}

	public void setNombre(System nombre) {
		Nombre = nombre;
	}

	public System getSexo() {
		return sexo;
	}

	public void setSexo(System sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Persona [colordepiel=" + colordepiel + ", edad=" + edad + ", Nombre=" + Nombre + ", sexo=" + sexo + "]";
	}
	

}
