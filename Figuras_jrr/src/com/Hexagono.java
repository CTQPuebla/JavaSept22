package com;

public class Hexagono extends Figura implements ICalculos {
	double lado;

	public Hexagono() {
		super("Hexagono");
	}

	public Hexagono(double lado) {
		super("Hexagono");
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
		return "Hexagono [lado=" + lado + ", nombre=" + nombre + "]";
	}

	@Override
	public double perimetro() {
		return lado * 6;
	}

	@Override
	public double area() {
		return 3 * lado * apotema();
		//return (perimetro() * apotema()) / 2;
	}

	@Override
	public double volumen() {
		return area()*lado;
		//return 3 * lado * apotema() * lado;
	}

	public double apotema() {
		return lado / 1.15;
	}

}
