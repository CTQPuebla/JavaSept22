package com;

public class Profesionista extends Persona{

	String Titulo;
	String GradodeEstudios;
	
	public void Trabajar() {
		
	}

	public Profesionista(String titulo, String gradodeEstudios) {
		super();
		Titulo = titulo;
		GradodeEstudios = gradodeEstudios;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getGradodeEstudios() {
		return GradodeEstudios;
	}

	public void setGradodeEstudios(String gradodeEstudios) {
		GradodeEstudios = gradodeEstudios;
	}

	@Override
	public String toString() {
		return "Profesionista [Titulo=" + Titulo + ", GradodeEstudios=" + GradodeEstudios + "]";
	}
	
}
