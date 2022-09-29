package com;

public class Automovil {

	
	//Atributos
		String color, marca, material, componentes;
		double largo, ancho;
		int modelo, puertas;
		
		//Constructores 
		public Automovil() {
			
		}

			public Automovil(String color, String marca, String material, String componentes, double largo, double ancho,
			int modelo, int puertas) { //argumentos que mi código necesita
			this.color = color;
			this.marca = marca;
			this.material = material;
			this.componentes = componentes;
			this.largo = largo;
			this.ancho = ancho;
			this.modelo = modelo;
			this.puertas = puertas;
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

			public String getComponentes() {
				return componentes;
			}

			public void setComponentes(String componentes) {
				this.componentes = componentes;
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

			public int getModelo() {
				return modelo;
			}

			public void setModelo(int modelo) {
				this.modelo = modelo;
			}

			public int getPuertas() {
				return puertas;
			}

			public void setPuertas(int puertas) {
				this.puertas = puertas;
			}
			
			//Radiografia (escanear el objeto y prueba lo que hay)
			public String toString() {
				return "Automovil [color=" + color + ", marca=" + marca + ", materiales=" + material + ", componentes="
						+ componentes + ", largo=" + largo + ", ancho=" + ancho + ", modelo=" + modelo + ", puertas=" + puertas + "]";
}


}