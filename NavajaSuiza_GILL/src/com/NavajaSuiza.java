package com;

public class NavajaSuiza {

	// Esta Clase no tiene main

	// Atributos
	double ancho, largo;
	// Atrivitos objetos
	Cuchillo cuhillo;
	Tijeras tijeras;
	Destornillador destornillador;

	// Constructor en vacio por default

	public NavajaSuiza() {

	}

	public NavajaSuiza(double ancho, double largo, Cuchillo cuhillo, Tijeras tijeras, Destornillador destornillador) {
		
		this.ancho = ancho;
		this.largo = largo;
		this.cuhillo = cuhillo;
		this.tijeras = tijeras;
		this.destornillador = destornillador;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getLargo() {
		return largo;
	}

	public void setLargo(double largo) {
		this.largo = largo;
	}

	public Cuchillo getCuhillo() {
		return cuhillo;
	}

	public void setCuhillo(Cuchillo cuhillo) {
		this.cuhillo = cuhillo;
	}

	public Tijeras getTijeras() {
		return tijeras;
	}

	public void setTijeras(Tijeras tijeras) {
		this.tijeras = tijeras;
	}

	public Destornillador getDestornillador() {
		return destornillador;
	}

	public void setDestornillador(Destornillador destornillador) {
		this.destornillador = destornillador;
	}

	@Override
	public String toString() {
		return "NavajaSuiza [ancho=" + ancho + ", largo=" + largo + ", cuhillo=" + cuhillo + ", tijeras=" + tijeras
				+ ", destornillador=" + destornillador + "]";
	}
	
	
	
	
	
	
}// class
