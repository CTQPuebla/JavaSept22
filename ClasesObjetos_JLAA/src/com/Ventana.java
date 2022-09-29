package com;

public class Ventana {
	
	
	// Atributos
	String color ;
	double ancho;
	double largo;
	String Material;
	int peso;
	
	
	public Ventana() {
		
	}


	public Ventana(String color, double ancho, double largo, String material, int peso) {

		this.color = color;
		this.ancho = ancho;
		this.largo = largo;
		Material = material;
		this.peso = peso;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
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


	public String getMaterial() {
		return Material;
	}


	public void setMaterial(String material) {
		Material = material;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	@Override
	public String toString() {
		return "Ventana [color=" + color + ", ancho=" + ancho + ", largo=" + largo + ", Material=" + Material
				+ ", peso=" + peso + "]";
	}
	
	

}
