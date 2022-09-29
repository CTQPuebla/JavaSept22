package com;

public class Profesionista {

	String titulo, gradosEstudios;
	
	public Profesionista() {
		
	}
	
	
	public Profesionista(String titulo, String gradosEstudios) {
		
		this.titulo = titulo;
		this.gradosEstudios = gradosEstudios;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getGradosEstudios() {
		return gradosEstudios;
	}


	public void setGradosEstudios(String gradosEstudios) {
		this.gradosEstudios = gradosEstudios;
	}

	@Override
	public String toString() {
		return "Profesionista [titulo=" + titulo + ", gradosEstudios=" + gradosEstudios + "]";
	}

	public void Trabajar() {
		
	}
	
}
