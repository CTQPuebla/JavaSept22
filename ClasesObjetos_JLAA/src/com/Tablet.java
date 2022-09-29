package com;

public class Tablet {
	
	// Atributos
	
	
	String color;
	double largo, ancho;
	String materiales;
	String marca;
	
	int botones;
	Camara Camara;
	Almacenamiento Almacenamiento;

	public Tablet () {  //MÉTODO CONSTRUCTOR 
		
	
	}

	public Tablet(String color, double largo, double ancho, String materiales, String marca, 
			int botones) {
		
		this.color = color;
		this.largo = largo;
		this.ancho = ancho;
		this.materiales = materiales;
		this.marca = marca;
		
		this.botones = botones;
	}
	
	
	public Tablet(String color, double largo, double ancho, String materiales, String marca, int botones,
			com.Camara camara, com.Almacenamiento almacenamiento) {
		
		this.color = color;
		this.largo = largo;
		this.ancho = ancho;
		this.materiales = materiales;
		this.marca = marca;
		this.botones = botones;
		Camara = camara;
		Almacenamiento = almacenamiento;
	}

	//SETTER (ESTABLECER UN VALOR AL ATRIBUTO
	// VOID=NO DEVUELVE NADA
	public void setColor(String color) {
		this.color=color;
	}
	
	//GETTER SALIDA (DEVUELVE UN VALOR)
	public String getColor () {
		return color;
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



	public int getBotones() {
		return botones;
	}

	public void setBotones(int botones) {
		this.botones = botones;
	}

	@Override
	public String toString() {
		return "Tablet [color=" + color + ", largo=" + largo + ", ancho=" + ancho + ", materiales=" + materiales
				+ ", marca=" + marca + ", botones=" + botones + ", Camara=" + Camara + ", Almacenamiento="
				+ Almacenamiento + "]";
	}
	
	
//RADIOGRAFÍA
	 
	//VER EL ESTADO DE LOS OBJETOS SE EXPRESA A TRAVÉS DE SUS ATRIBUTOS 
	

	
	
	

}
