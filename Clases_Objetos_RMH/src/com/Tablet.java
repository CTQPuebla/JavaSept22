package com;

public class Tablet {
	//Atributos
	String color,materiales,marca,so;
	double largo,ancho;
	int botones;
	//Atributos objeto
	Camara camara;//Observadores la clase en negra y el objeto en azul
	Almacenamiento almacenamiento;
	
	//Contructores
	public Tablet(){//MEtodo Vacio
		
	}

	public Tablet(String color, String materiales, String marca,String so, double largo,
			double ancho, int botones) {//Argumentos
		this.color = color;//Atribuos de la clase llevan this
		this.materiales = materiales;//atributo (azul)= argumento(negro)
		this.marca = marca;
		this.so = so;
		this.largo = largo;
		this.ancho = ancho;
		this.botones = botones;
	}
	
	//Constructor (NO HAY LIMITE)
	public Tablet(String color, String materiales, String marca, String so, double largo, double ancho, int botones,
			Camara camara, Almacenamiento almacenamiento) {
		//super();
		this.color = color;
		this.materiales = materiales;
		this.marca = marca;
		this.so = so;
		this.largo = largo;
		this.ancho = ancho;
		this.botones = botones;
		this.camara = camara;
		this.almacenamiento = almacenamiento;
	}

	//Setter - entrada(establece un valor en un atributo)
	//Metodo void = no devuelve nada(metodo de java)
	public void setColor(String color) {//Se crea atributo color
		this.color = color;//Se le asigna al atributo de la clase
	}
	//Getter = Salida (devuelve un valor)//me da salida al atributo
	public String getColor() {//String porque es el tipo de valor que devuelve el metodo;
		
		return color;//da salida al metodo
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
	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
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
	//Radiografia(metodo )me imprime todos los valores del objeto
	@Override
	public String toString() {
		return "Tablet [color=" + color + ", materiales=" + materiales + ", marca=" + marca + ", so=" + so + ", largo="
				+ largo + ", ancho=" + ancho + ", botones=" + botones + ", camara=" + camara + ", almacenamiento="
				+ almacenamiento + "]";
	}
	
	
	
	

	

}
