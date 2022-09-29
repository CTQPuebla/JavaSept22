package com;

public class Profesionista extends Persona {
	
	String titulo,gradoestudios;
	
	//Es un metodo

	public Profesionista(String colorpiel, String nombre, String sexo, int edad, String titulo, String gradoestudios) {
		super(colorpiel, nombre, sexo, edad);
		this.titulo = titulo;
		this.gradoestudios = gradoestudios;
	}



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
		return "Profesionista [titulo=" + titulo + ", gradoestudios=" + gradoestudios + ", colorpiel=" + colorpiel
				+ ", nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + "]";
	}


	public void Imprimir() {
		System.out.println();
	} 
	public void Trabajar() {
		
	}



}
