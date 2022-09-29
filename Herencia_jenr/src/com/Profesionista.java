package com;

public class Profesionista extends Persona{
	
	String titulo;
	String gradoEstudios;

public Profesionista () {
	
}

public Profesionista(String titulo, String gradoEstudios) {
	super();
	this.titulo = titulo;
	this.gradoEstudios = gradoEstudios;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getGradoEstudios() {
	return gradoEstudios;
}

public void setGradoEstudios(String gradoEstudios) {
	this.gradoEstudios = gradoEstudios;
}

@Override
public String toString() {
	return "Profesionista [titulo=" + titulo + ", gradoEstudios=" + gradoEstudios + "]";
}
public void trabajador() {
	
}
}