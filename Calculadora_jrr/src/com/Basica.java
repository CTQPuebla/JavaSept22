package com;

public class Basica extends Calculadora {
	
	public Basica() {
	}
	
	public Basica(String materiales, String capacidadBateria, String marca, String precio) {
		super(materiales, capacidadBateria, marca, precio);
	}

	@Override
	public double sumar(double a, double b) {
		return a + b;
	}

	@Override
	public double restar(double a, double b) {
		return a - b;
	}

	@Override
	public double multiplicar(double a, double b) {
		return a * b;
	}

	@Override
	public double dividir(double a, double b) {
		if (b != 0) {
			return a / b;
		}
		return 0;
	}

}
