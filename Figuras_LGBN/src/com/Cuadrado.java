package com;

public class Cuadrado extends Figura {

	int lado;

	public Cuadrado() {

	}

	public Cuadrado(int lado) {
		super();
		this.lado = lado;

	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}

	public double perimetro() {
		return this.lado * 4;
	}

	public double area() {
		return this.lado * this.lado;
	}

	public double volumen() {
		return this.lado * this.lado * this.lado;
	}

}
