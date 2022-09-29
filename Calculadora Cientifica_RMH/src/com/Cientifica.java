package com;

public class Cientifica extends Calculadora implements IOperacionesCientificas /*,"OtraInterface"*/{
	//Vamos a haver una interface(file new interface SIEMPRE EMPIEZA CON I)
	//Añadimos los metodos de la Interfaces
	
	public Cientifica () {
		
	}

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
	public double potencia(double base, int exponente) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double coseno(double numero) {
		// TODO Auto-generated method stub
		return 0;
	}

}
