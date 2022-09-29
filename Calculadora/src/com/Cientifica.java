package com;

public class Cientifica extends Calculadora implements IOperacionescientificas {

	public Cientifica () {
		
	}
	
	@Override
	public double multiplicar(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double suma(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double resta(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double dividir(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public double raizCuadrada(double numero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double seno(double numero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double potencia(double base, double exponente) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double coseno(double numero) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
