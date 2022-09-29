package com;

public class Circulo extends Figura implements ICalculos {
	double radio;

	public Circulo() {
		super("Circulo");
	}

	public Circulo(double radio) {
		super("Circulo");
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", nombre=" + nombre + "]";
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * radio;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radio,2);
	}

	@Override
	public double volumen() {
		return (4 / 3) * Math.PI * Math.pow(radio,3);
	}

}
