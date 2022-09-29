package com;

public class Profesionista extends Persona {
	String titulo;
	String gradoEstudios;

	public Profesionista() {
		super();
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

	public void trabajar() {
		System.out.println("Trabajando...");
	}

	@Override
	public String toString() {
		return "Profesionista [titulo=" + titulo + ", gradoEstudios=" + gradoEstudios + ", getColorPiel()="
				+ getColorPiel() + ", getEdad()=" + getEdad() + ", getSexo()=" + getSexo() + ", getCiudadania()="
				+ getCiudadania() + "]";
	}
	

}
