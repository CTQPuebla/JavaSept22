package com;

public class Carro {
	//Atributos
	String marca,modelo,color;
	int a�o,puertas;
	
	//Constructores
	public Carro() {//Vacio
		
	}
//Clic derecho, source, generate contructor using fields, click en generate  
	public Carro(String marca, String modelo, String color, int a�o, int puertas) {
		//Argumentos, quitar el super
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.a�o = a�o;
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
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
		return "Carro [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", a�o=" + a�o + ", puertas="
				+ puertas + "]";
	}
	
	
	
	
	
}
