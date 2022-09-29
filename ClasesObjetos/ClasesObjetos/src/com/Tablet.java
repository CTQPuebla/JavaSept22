package com;

public class Tablet {
	//atributos
	String color, materiales, marca, componenetes;
	double largo, ancho;
	int botones;
	
	Camara camara;
	Almacenamiento almacenamiento;
	
	//constructores
	
	public Tablet(){
		
	}

	public Tablet(String color, String materiales, String marca, String componenetes, double largo, double ancho,
			int botones) {
		
		this.color = color;
		this.materiales = materiales;
		this.marca = marca;
		this.componenetes = componenetes;
		this.largo = largo;
		this.ancho = ancho;
		this.botones = botones;
	}
	
	
	public Tablet(String color, String materiales, String marca, double largo, double ancho,
			int botones, Camara camara, Almacenamiento almacenamiento) {
	
		this.color = color;
		this.materiales = materiales;
		this.marca = marca;
		this.largo = largo;
		this.ancho = ancho;
		this.botones = botones;
		this.camara = camara;
		this.almacenamiento = almacenamiento;
	}

	//setter-ebtrada
	//metodo void(vacio) que no devuelve valor
	public void setColor(String color) {
		this.color = color;
	}
	//salida donde devuelve el valor
	public String getColor() {
		return color;
	}

	public String getMateriales() {
		return materiales;
	}

	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getComponenetes() {
		return componenetes;
	}

	public void setComponenetes(String componenetes) {
		this.componenetes = componenetes;
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

	public int getBotones() {
		return botones;
	}

	public void setBotones(int botones) {
		this.botones = botones;
	}
	//metodo toStrin (radiografia)

	@Override
	public String toString() {
		return "Tablet [color=" + color + ", materiales=" + materiales + ", marca=" + marca + ", componenetes="
				+ componenetes + ", largo=" + largo + ", ancho=" + ancho + ", botones=" + botones + ", camara=" + camara
				+ ", almacenamiento=" + almacenamiento + "]";
	}

	
	
	}
	


