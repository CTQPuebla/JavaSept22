package com;

public class Tablet {
	
	//Atributos
	String color, marca, materiales;
	double largo, ancho;
	int botones;
	
	//Atributos objetos; esto se llama composición, puede tener otros objetos
	Camara camara;
	Almacenamiento almacenamento;
	
	//Constructores
	
	public Tablet () {
		
	}

           public Tablet(String color, String marca, String materiales, double largo, double ancho,
			int botones, Camara camara, Almacenamiento almacenamento) {
		super();
		this.color = color;
		this.marca = marca;
		this.materiales = materiales;
		this.largo = largo;
		this.ancho = ancho;
		this.botones = botones;
		this.camara = camara;
		this.almacenamento = almacenamento;
	}

		//argumentos: datos que necesita para trabajar	
	public Tablet(String color, String marca, String materiales, double largo, double ancho,
			int botones) {
		/*todos los atributos de la clase llevan el this y esto es de que me refiero a cosas que estan en la misma clase
		lo de la derecha es el argumento que esta recibiendo en los parentesis
		*/
		this.color = color;
		this.marca = marca;
		this.materiales = materiales;
		this.largo = largo;
		this.ancho = ancho;
		this.botones = botones;
	}
	
	//Setter - entrada (establece un valor en un atributo)
	//1 void - no devuelve nada, es una de los dos meotos que existen en java, es una acción que establece un valor
	public void setColor(String color) {
		//la logica es llamar al atributo de la clase. en este ejemplo es color//
		this.color = color;
		
			
	}
	
	//Getter -  Salida (devuelve un valor)
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

	@Override
	public String toString() {
		return "Tablet [color=" + color + ", marca=" + marca + ", materiales=" + materiales + ", largo=" + largo
				+ ", ancho=" + ancho + ", botones=" + botones + ", camara=" + camara + ", almacenamento="
				+ almacenamento + "]";
	}

	//radiografia
	//este metodo me imprime todos los valores que estan en el objeto
	
	//metodo to String  es una radiografia
	
	
	

}
