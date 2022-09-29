package com;

public class Casa {
	String material,color;
	int cuartos, baños,ventanas,puertas;
	double largo,ancho;
	
	public Casa() {
		
	}
//clic derecho,source,generate contructor using fields,click en generate
	public Casa(String material, String color, int cuartos, int baños, int ventanas, int puertas, double largo,
			double ancho) {
	//quitar el super
		this.material = material;
		this.color = color;
		this.cuartos = cuartos;
		this.baños = baños;
		this.ventanas = ventanas;
		this.puertas = puertas;
		this.largo = largo;
		this.ancho = ancho;
	}
	//Setter - entrada (establece un valor en un atributo
	//clic derecho, source,generatte set y get, select all,generate
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCuartos() {
		return cuartos;
	}
	public void setCuartos(int cuartos) {
		this.cuartos = cuartos;
	}
	public int getBaños() {
		return baños;
	}
	public void setBaños(int baños) {
		this.baños = baños;
	}
	public int getVentanas() {
		return ventanas;
	}
	public void setVentanas(int ventanas) {
		this.ventanas = ventanas;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
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
	//clic derecho,source,generate to string, select all,  generate 
	@Override
	public String toString() {
		return "Casa [material=" + material + ", color=" + color + ", cuartos=" + cuartos + ", baños=" + baños
				+ ", ventanas=" + ventanas + ", puertas=" + puertas + ", largo=" + largo + ", ancho=" + ancho + "]";
	}
	
	
	
	

}
