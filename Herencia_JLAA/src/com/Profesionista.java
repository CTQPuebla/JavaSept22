package com;

public class Profesionista extends Persona {
	
	String Titulo;
	String gradosEstudios;
	
	public Profesionista () {
		
	}
	
	
	
	public Profesionista(String titulo, String gradosEstudios) {
		
		Titulo = titulo;
		this.gradosEstudios = gradosEstudios;
	}
	

	public String getTitulo() {
		return Titulo;
	}



	public void setTitulo(String titulo) {
		Titulo = titulo;
	}



	public String getGradosEstudios() {
		return gradosEstudios;
	}



	public void setGradosEstudios(String gradosEstudios) {
		this.gradosEstudios = gradosEstudios;
	}



	public void Trabajador (){
		
	}

}
