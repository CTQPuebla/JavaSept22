package com;

public class Microondas {

	// Atributos
	String color, marca, material;
	double largo, ancho, peso;
	int boton, puerta, foco, plato;

	// Constructores

	public Microondas() {
	}
	
	//para generar constructor, se le da clic derecho y es en source generate constructor
	public Microondas(String color, String marca, String material, double largo, double ancho, double peso, int boton,
			int puerta, int foco, int plato) {

		this.color = color;
		this.marca = marca;
		this.material = material;
		this.largo = largo;
		this.ancho = ancho;
		this.peso = peso;
		this.boton = boton;
		this.puerta = puerta;
		this.foco = foco;
		this.plato = plato;
	}

	// Argumentos
	public void setColor(String color) {
		
		this.color = color;	
	}
	
	//para crear todos es clic secundario y en Source generate setters and getters
	
	public String getColor() {
		return color;
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

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getBoton() {
		return boton;
	}

	public void setBoton(int boton) {
		this.boton = boton;
	}

	public int getPuerta() {
		return puerta;
	}

	public void setPuerta(int puerta) {
		this.puerta = puerta;
	}

	public int getFoco() {
		return foco;
	}

	public void setFoco(int foco) {
		this.foco = foco;
	}

	public int getPlato() {
		return plato;
	}

	public void setPlato(int plato) {
		this.plato = plato;
	}
	
	@Override
	//este se crea con source to string
	public String toString() {
		return "Microondas [color=" + color + ", marca=" + marca + ", material=" + material + ", largo=" + largo
				+ ", ancho=" + ancho + ", peso=" + peso + ", boton=" + boton + ", puerta=" + puerta + ", foco=" + foco
				+ ", plato=" + plato + "]";
	}
	
}
