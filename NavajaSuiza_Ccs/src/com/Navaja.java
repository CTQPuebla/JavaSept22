package com;

public class Navaja {
	
	//Atrtibuto
	String marca, color;
	int tamaño;
	
	//Atributo de objeto
	Destornillador destornillador;
	Tijeras tijeras;
	Alicate alicate;
	
	//Constructor
	public Navaja() {
		
	}
	
	//Metodo constructor con argumentos
	public Navaja(String marca, String color, int tamaño) {
		super();
		this.marca = marca;
		this.color = color;
		this.tamaño = tamaño;
	}
	
	
	public Navaja(String marca, String color, int tamaño, Destornillador destornillador, Tijeras tijeras,
			Alicate alicate) {
		super();
		this.marca = marca;
		this.color = color;
		this.tamaño = tamaño;
		this.destornillador = destornillador;
		this.tijeras = tijeras;
		this.alicate = alicate;
	}

	//Setter - entrada(establece un valor en un atributo)
	//metodo void - no devuelve nada
		
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Navaja [marca=" + marca + ", color=" + color + ", tamaño=" + tamaño + ", destornillador="
				+ destornillador + ", tijeras=" + tijeras + ", alicate=" + alicate + "]";
	}


}

