package com;

public class Cientifica extends Calculadora implements IOperacionesCientificas {

	@Override
	public double sumar(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double restar(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double multiplicar(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double dividir(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public double raizcuadrada(double numero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double seno(double numero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double potencia(double base, double exponete) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double coseno(double numero) {
		// TODO Auto-generated method stub
		return 0;
	}

}//class
