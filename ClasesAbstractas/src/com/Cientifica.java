package com;

public class Cientifica extends Calculadora  implements IOperacionesCientificas {

	public Cientifica () {
		
	}

	@Override
	public double multiplicar(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public double restar(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double sumar(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public double dividir(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public double RaizCuadrada(double numero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double Seno(double numero) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double Potencia(double base, double exponente) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double Coseno(double numero) {
		// TODO Auto-generated method stub
		return 0;
	}
}
