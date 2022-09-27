package com;

public class Navaja {
	
	//Atrtibuto
	String marca, color;
	int tama�o;
	
	//Atributo de objeto
	Destornillador destornillador;
	Tijeras tijeras;
	Alicate alicate;
	
	//Constructor
	public Navaja() {
		
	}
	
	//Metodo constructor con argumentos
	public Navaja(String marca, String color, int tama�o) {
		super();
		this.marca = marca;
		this.color = color;
		this.tama�o = tama�o;
	}
	
	
	public Navaja(String marca, String color, int tama�o, Destornillador destornillador, Tijeras tijeras,
			Alicate alicate) {
		super();
		this.marca = marca;
		this.color = color;
		this.tama�o = tama�o;
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

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Navaja [marca=" + marca + ", color=" + color + ", tama�o=" + tama�o + ", destornillador="
				+ destornillador + ", tijeras=" + tijeras + ", alicate=" + alicate + "]";
	}


}

