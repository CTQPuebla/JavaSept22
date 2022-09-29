package com;

public class Cuadrado extends Figura implements ICalculos {
	double lado;

	public Cuadrado() {
		super("Cuadrado");
	}

	public Cuadrado(double lado) {
		super("Cuadrado");
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + ", nombre=" + nombre + "]";
	}

	@Override
	public double perimetro() {
		return lado * 4;
	}

	@Override
	public double area() {
		return Math.pow(lado, 2);
		//return lado * lado;
	}

	@Override
	public double volumen() {
		return Math.pow(lado, 3);
		//return lado * lado * lado;
	}

}
