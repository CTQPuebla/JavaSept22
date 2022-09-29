package com;

public class Cientifica extends Calculadora implements IoperacionesCientificas {
	
	public Cientifica () {
		
	}

	@Override
	public double sumar(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public double restar(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public double multiplicar(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double dividir(int a, int b) {
		// TODO Auto-generated method stub
		return a / b;
	}

	@Override
	public double raizCuadrada(double a) {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public double seno(double a) {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public double potencia(double a, double b) {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public double coseno(double a) {
		// TODO Auto-generated method stub
		return a;
	}
	
	

}
