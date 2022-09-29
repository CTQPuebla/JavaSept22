package com;

public class Persona {
	
	String coloPiel;
	int edad;
	String nombre;
	String sexo;
	String ciudadania;


public Persona() {
	
}


public Persona(String coloPiel, int edad, String nombre, String sexo, String ciudadania) {
	super();
	this.coloPiel = coloPiel;
	this.edad = edad;
	this.nombre = nombre;
	this.sexo = sexo;
	this.ciudadania = ciudadania;
}


public String getColoPiel() {
	return coloPiel;
}


public void setColoPiel(String coloPiel) {
	this.coloPiel = coloPiel;
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
	return "Persona [coloPiel=" + coloPiel + ", edad=" + edad + ", nombre=" + nombre + ", sexo=" + sexo
			+ ", ciudadania=" + ciudadania + "]";
}






}