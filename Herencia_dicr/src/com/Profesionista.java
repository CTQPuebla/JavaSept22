package com;

public class Profesionista extends Persona {

	String Titulo, GradoEstudios;
	
	
	public Profesionista() {
		
	}
	
	
	public Profesionista(String titulo, String gradoEstudios) {
		super();
		Titulo = titulo;
		GradoEstudios = gradoEstudios;
	}
	


	public String getTitulo() {
		return Titulo;
	}


	public void setTitulo(String titulo) {
		Titulo = titulo;
	}


	public String getGradoEstudios() {
		return GradoEstudios;
	}


	public void setGradoEstudios(String gradoEstudios) {
		GradoEstudios = gradoEstudios;
	}


	public void trabajar() {
		System.out.println();
	}
	
}
