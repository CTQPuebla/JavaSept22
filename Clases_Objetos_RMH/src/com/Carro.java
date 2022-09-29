package com;

public class Carro {
	//Atributos
	String marca,modelo,color;
	int año,puertas;
	
	//Constructores
	public Carro() {//Vacio
		
	}
//Clic derecho, source, generate contructor using fields, click en generate  
	public Carro(String marca, String modelo, String color, int año, int puertas) {
		//Argumentos, quitar el super
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.año = año;
		this.puertas = puertas;
		
		
	}
//clic derecho, source, generatte set y get, select all , generate
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
//clic derecho, source, generate to string, sellect all, generate
	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", año=" + año + ", puertas="
				+ puertas + "]";
	}
	
	
	
	
	
}
