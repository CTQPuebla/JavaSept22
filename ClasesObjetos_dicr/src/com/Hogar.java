package com;

public class Hogar {

	String color, materiales;
	int puertas, ventanas, cuartos, ba�os;
	double largo, ancho;
	
	//Constructores
	public Hogar() {
		
	}
	//clic derecho, source daremos clic, generate contructor using fields, clic en generate
	public Hogar(String color, String materiales, int puertas, int ventanas, int cuartos, int ba�os, double largo,
						double ancho) //Argumentos, quitar el super
	{
		this.color = color;
		this.materiales = materiales;
		this.puertas = puertas;
		this.ventanas = ventanas;
		this.cuartos = cuartos;
		this.ba�os = ba�os;
		this.largo = largo;
		this.ancho = ancho;
	}
	
	//Entrada
	//clic derecho, source, generate getters and setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMateriales() {
		return materiales;
	}
	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getVentanas() {
		return ventanas;
	}
	public void setVentanas(int ventanas) {
		this.ventanas = ventanas;
	}
	public int getCuartos() {
		return cuartos;
	}
	public void setCuartos(int cuartos) {
		this.cuartos = cuartos;
	}
	public int getBa�os() {
		return ba�os;
	}
	public void setBa�os(int ba�os) {
		this.ba�os = ba�os;
	}
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	//clic derecho, source, generate toString 
	@Override
	public String toString() {
		return "Hogar [color=" + color + ", materiales=" + materiales + ", puertas=" + puertas + ", ventanas="
				+ ventanas + ", cuartos=" + cuartos + ", ba�os=" + ba�os + ", largo=" + largo + ", ancho=" + ancho
				+ "]";
	} 
	
	
	

	

}
