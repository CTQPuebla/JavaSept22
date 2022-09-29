package com;

public class Basica extends Calculadora {
	
	
	public Basica(){
		
	}

	@Override
	public double multiplicar(int a, int b) {

		return a*b ;
	}

	@Override
	public double division(int a, int b) {
		
		return a/b ;
	}

	@Override
	public double suma(int a, int b) {

		return a+a ;
	}

	@Override
	public double resta(int a, int b) {
	
		return a-b ;
	}

}
