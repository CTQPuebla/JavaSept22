package com;

public class Basica extends Calculadora{
	
	
	public Basica() {
		
	}

	@Override
	public double sumar(int a, int b) {
		// TODO Auto-generated method stub
		double suma;
		
	return a + b;		
		
	}

	@Override
	public double restar(int a, int b) {
		// TODO Auto-generated method stub
		double resta;
		
		return  a-b;
		
	
	}

	@Override
	public double multiplicar(int a, int b) {
		// TODO Auto-generated method stub
		double multiplicacion;
		
		return a*b;
	
	}

	@Override
	public double dividir(int a, int b) {
		// TODO Auto-generated method stub
		double division;
		
		return a/b;
		
	}
	
	

}
