package com;

public class Cientifica extends Calculadora implements IOperacionesCientificas {

	public Cientifica() {

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
		System.out.println("ERROR. No se puede dividir entre cero");
		return 0;
	}

	@Override
	public double raizCuadrada(double n) {
		Math.sqrt(n);
		return 0;
	}

	@Override
	public double seno(double n) {
		return Math.sin(n);
	}

	@Override
	public double coseno(double n) {
		return Math.cos(n);
	}

	@Override
	public double potencia(double base, double exponente) {
		return Math.pow(base, exponente);
	}

}
