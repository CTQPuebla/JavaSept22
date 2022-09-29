package com;

public class Profesionista extends Persona{
	
	String titulo, gradoestudios;
	
	
	
	
	public Profesionista(String colorpiel, String nombre, String sexo, String ciudadania, int edad, String titulo,
			String gradoestudios) {
		super(colorpiel, nombre, sexo, ciudadania, edad);
		this.titulo = titulo;
		this.gradoestudios = gradoestudios;
	}
	//super(colorpiel, nombre, sexo, ciudadania, edad);
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getGradoestudios() {
		return gradoestudios;
	}


	public void setGradoestudios(String gradoestudios) {
		this.gradoestudios = gradoestudios;
	}


	@Override
	public String toString() {
		return "Profesionista [titulo=" + titulo + ", gradoestudios=" + gradoestudios + "]";
	}
	
	public void Trabajar() {
		
	}

	
}
