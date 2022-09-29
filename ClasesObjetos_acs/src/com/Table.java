package com;

public class Table {

	//Atributos
	String color, marca, materiales;
	double largo, ancho;
	int botones;
	
	//Atributos ojetos
	Camara camara;
	Almacenamiento almacenamiento;  
	
	//Constructores 
	public Table() {
		
	}
	
	
	public Table(String color, String marca, String materiales, double largo, double ancho, int botones, Camara camara,
			Almacenamiento almacenamiento) {
		super();
		this.color = color;
		this.marca = marca;
		this.materiales = materiales;
		this.largo = largo;
		this.ancho = ancho;
		this.botones = botones;
		this.camara = camara;
		this.almacenamiento = almacenamiento;
	}

	public Table(String color, String marca, String materiales, double largo, double ancho,
			int botones) { //argumentos que mi código necesita
		this.color = color;
		this.marca = marca;
		this.materiales = materiales;
		this.largo = largo;
		this.ancho = ancho;
		this.botones = botones;
	}
	
	//Getter - Salida (devuelve un valor)
	public String getColor() {
		return color; // puerta de salida del metodo
	}
	//Setter - Entrada(Establece un valor en un atributo)
	//1 Void - no devuelve nada
	public void setColor(String color) {
		this.color = color;
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


	@Override
	public String toString() {
		return "Table [color=" + color + ", marca=" + marca + ", materiales=" + materiales + ", largo=" + largo
				+ ", ancho=" + ancho + ", botones=" + botones + ", camara=" + camara + ", almacenamiento="
				+ almacenamiento + "]";
	}

	//Radiografia (escanear el objeto y prueba lo que hay)
	
	
	
}
