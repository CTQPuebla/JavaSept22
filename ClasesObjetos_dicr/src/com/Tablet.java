package com;

public class Tablet {

		//Atributos
	String color, marca, materiales;
	double largo, ancho;
	int botones;
	
	//Atributos objeto
	Camara camara;  //composicion (izquierda es la clase y de lado derecho es el objeto)
	Almacenamiento almacenamiento; //Se pueden meter objeto dentro de un objeto
	
	
	//Constructores
	public Tablet() {  //Metodo vacío
		
	}


	public Tablet(String color, String marca, String materiales, double largo, double ancho,
			int botones) {
		this.color = color;
		this.marca = marca;
		this.materiales = materiales;
	//	this.componentes = componentes;
		this.largo = largo;
		this.ancho = ancho;
		this.botones = botones;
	}
	
	
	
	public Tablet(String color, String marca, String materiales, double largo, double ancho, int botones, Camara camara,
			Almacenamiento almacenamiento) { //	No hay limites para los constructores
		this.color = color;
		this.marca = marca;
		this.materiales = materiales;
		this.largo = largo;
		this.ancho = ancho;
		this.botones = botones;
		this.camara = camara;
		this.almacenamiento = almacenamiento;
	}


	//Entrada
	//Setter - entrada (establece un valor en un atributo)
	//1 Void - no devuelve nada(es el vacio)
	
	public void setColor(String color) {
		this.color = color;
	}

	//Getter - Salida (devuelve un valor)
	public String getColor() {
		return color;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getMateriales() {
		return materiales;
	}


	public void setMateriales(String materiales) {
		this.materiales = materiales;
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

	//Radiografía
	@Override
	public String toString() {
		return "Tablet [color=" + color + ", marca=" + marca + ", materiales=" + materiales + ", largo=" + largo
				+ ", ancho=" + ancho + ", botones=" + botones + ", camara=" + camara + ", almacenamiento="
				+ almacenamiento + "]";
	}

	
	
	
	
	
}
