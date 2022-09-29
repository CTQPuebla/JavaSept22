package com;
//CUANDO MARQUE ERROR HAY QUE IMPLEMENTAR LOS METODOS DE FORMA AUTMATICA CON EL IDE
public class Basica extends Calculadora{
	
	public Basica() {
		
	}

	@Override
	public double sumar(int a, int b) {
		// TODO Auto-generated method stub
		double suma;
		
		suma = (double) a + b;
		
		return suma;
	}

	@Override
	public double restar(int a, int b) {
		// TODO Auto-generated method stub
		double resta;
		
		resta = a - b;
		
		return resta;
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
	
	

}
