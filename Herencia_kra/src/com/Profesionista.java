package com;

public class Profesionista extends Persona {

	String titulo, gradodeestudios;

	public Profesionista() {

	}

	public Profesionista(String titulo, String gradodeestudios) {
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
		return "Profesionista [titulo=" + titulo + ", gradodeestudios=" + gradodeestudios + "]";
	}

	public void trabajar() {
	}

}
