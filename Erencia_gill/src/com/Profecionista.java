package com;

public class Profecionista extends Persona {
	String titulo,gradodeestudios;
	
	public void Trabajar(){
		
	}

	public Profecionista(String colordepiel, String nombre, String ciudadania, String sexo, int edad, String titulo,
	
			String gradodeestudios) {
		super(colordepiel, nombre, ciudadania, sexo, edad);
		this.titulo = titulo;
		this.gradodeestudios = gradodeestudios;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGradodeestudios() {
		return gradodeestudios;
	}

	public void setGradodeestudios(String gradodeestudios) {
		this.gradodeestudios = gradodeestudios;
	}

	@Override
	public String toString() {
		return "Profecionista [titulo=" + titulo + ", gradodeestudios=" + gradodeestudios + "]";
	}

	
	
	
	

}//class
