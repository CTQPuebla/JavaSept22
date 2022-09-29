package com;

public class Navaja {

	String color, marca, material;
	double largo, ancho;
	int accesorios;
	
	desarmador desarmador;
	Pinsas Pinsas;
	
	public Navaja() {
		
	}


	public Navaja(String color, String marca, String material, double largo, double ancho, int accesorios) {
		super();
		this.color = color;
		this.marca = marca;
		this.material = material;
		this.largo = largo;
		this.ancho = ancho;
		this.accesorios = accesorios;
	}
	


	public Navaja(String color, String marca, String material, double largo, double ancho, int accesorios,
			com.desarmador desarmador, com.Pinsas pinsas) {
		super();
		this.color = color;
		this.marca = marca;
		this.material = material;
		this.largo = largo;
		this.ancho = ancho;
		this.accesorios = accesorios;
		this.desarmador = desarmador;
		Pinsas = pinsas;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
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


	public int getAccesorios() {
		return accesorios;
	}


	public void setAccesorios(int accesorios) {
		this.accesorios = accesorios;
	}


	@Override
	public String toString() {
		return "Navaja [color=" + color + ", marca=" + marca + ", material=" + material + ", largo=" + largo
				+ ", ancho=" + ancho + ", accesorios=" + accesorios + "]";
	}
	
	
}
