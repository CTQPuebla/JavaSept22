package com;

public class Cientifica extends Calculadora implements IOperacionesCientificas {
	
	
	public Cientifica() {
		
	}

	@Override
	public double multiplicar(int a, int b) {

		return a*b;
	}

	@Override
	public double division(int a, int b) {
		
		return a/b;
	}

	@Override
	public double suma(int a, int b) {
	
		return a+a;
	}

	@Override
	public double resta(int a, int b) {
		
		return a-b;
	}

	@Override
	public double raizCuadrado(double numero) {

		return Math.sqrt(numero);
	}

	@Override
	public double seno(double numero) {
	
		return Math.sin(numero);
	}

	@Override
	public double potencia(double base, double exponente) {

		return Math.pow(base, exponente);
	}

	@Override
	public double coseno(double numero) {

		return Math.cos(numero);
	}

}
