package com;

public class Profesional extends Persona {

	String titulo;
	String gradoDeEstudios;
	
	public Profesional() {
		
	}
	
	public Profesional(String titulo, String gradoDeEstudios) {
		super();
		this.titulo = titulo;
		this.gradoDeEstudios = gradoDeEstudios;
	}
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGradoDeEstudios() {
		return gradoDeEstudios;
	}

	public void setGradoDeEstudios(String gradoDeEstudios) {
		this.gradoDeEstudios = gradoDeEstudios;
	}
	

	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", gradoDeEstudios=" + gradoDeEstudios + "]";
	}

	public void trabajar() {
		
	}
	
	
}
