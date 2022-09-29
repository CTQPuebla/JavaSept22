//package com;
//
//public class Tablet {
//
//	//Atributos
//	String color, marca, materiales, componentes, sistema;
//	double largo, ancho;
//	int botones;
//	
//	//Constructores
//	public Tablet () {
//		
//	}
//
//	public Tablet(String color, String marca, String materiales, String componentes, String sistema, double largo,
//			double ancho, int botones) {
//
//		this.color = color;
//		this.marca = marca; 
//		this.materiales = materiales;
//		this.componentes = componentes;
//		this.sistema = sistema;
//		this.largo = largo;
//		this.ancho = ancho;
//		this.botones = botones;
//	}
//	
//	//Setter - entrada (establecer un valor en un atributo)
//	//1 Void - no devuelve nada
//	public void setColor(String color) {
//		this.color = color;
//		
//	}
//	
//	//Getter - Salida (devuleve un valor)
//	public String getColor() {
//		return color;
//		
//	}
//
//	public String getMarca() {
//		return marca;
//	}
//
//	public void setMarca(String marca) {
//		this.marca = marca;
//	}
//
//	public String getMateriales() {
//		return materiales;
//	}
//
//	public void setMateriales(String materiales) {
//		this.materiales = materiales;
//	}
//
//	public String getComponentes() {
//		return componentes;
//	}
//
//	public void setComponentes(String componentes) {
//		this.componentes = componentes;
//	}
//
//	public String getSistema() {
//		return sistema;
//	}
//
//	public void setSistema(String sistema) {
//		this.sistema = sistema;
//	}
//
//	public double getLargo() {
//		return largo;
//	}
//
//	public void setLargo(double largo) {
//		this.largo = largo;
//	}
//
//	public double getAncho() {
//		return ancho;
//	}
//
//	public void setAncho(double ancho) {
//		this.ancho = ancho;
//	}
//
//	public int getBotones() {
//		return botones;
//	}
//
//	public void setBotones(int botones) {
//		this.botones = botones;
//	}
//
//	//Radiografía
//	@Override
//	public String toString() {
//		return "Tablet [color=" + color + ", marca=" + marca + ", materiales=" + materiales + ", componentes="
//				+ componentes + ", sistema=" + sistema + ", largo=" + largo + ", ancho=" + ancho + ", botones="
//				+ botones + "]";
//	}
	
	
	package com;

	public class Tablet {

		//Atributos
		String color, marca, materiales, sistema;
		double largo, ancho;
		int botones;
		Camara camara;
		Almacenamiento almacenamiento;
		
		//Constructores
		public Tablet () {
			
		}

		public Tablet(String color, String marca, String materiales, String sistema, double largo,
				double ancho, int botones) {

			this.color = color;
			this.marca = marca; 
			this.materiales = materiales;
			this.sistema = sistema;
			this.largo = largo;
			this.ancho = ancho;
			this.botones = botones;
		}
		
		public Tablet(String color, String marca, String materiales, String sistema, double largo, double ancho,
				int botones, Camara camara, Almacenamiento almacenamiento) {
			
			this.color = color;
			this.marca = marca;
			this.materiales = materiales;
			this.sistema = sistema;
			this.largo = largo;
			this.ancho = ancho;
			this.botones = botones;
			this.camara = camara;
			this.almacenamiento = almacenamiento;
		}

		//Setter - entrada (establecer un valor en un atributo)
		//1 Void - no devuelve nada
		public void setColor(String color) {
			this.color = color;
			
		}
		
		//Getter - Salida (devuleve un valor)
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
	
		public String getSistema() {
			return sistema;
		}
	
		public void setSistema(String sistema) {
			this.sistema = sistema;
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
			return "Tablet [color=" + color + ", marca=" + marca + ", materiales=" + materiales + ", sistema=" + sistema
					+ ", largo=" + largo + ", ancho=" + ancho + ", botones=" + botones + ", camara=" + camara
					+ ", almacenamiento=" + almacenamiento + "]";
		}
	
}
