package com;

public class Cuadrado extends Figuras implements ICalculosCuadrado{
	
	double nLado;
	
	public Cuadrado () {
		
	}

	
	
	
	
	
	
	public double getnLado() {
		return nLado;
	}







	public void setnLado(double nLado) {
		this.nLado = nLado;
	}







	@Override
	public String toString() {
		return "Cuadrado [nLado=" + nLado + "]";
	}







	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return this.nLado*4;
	}







	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.pow(nLado, 2);
	}







	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return Math.pow(nLado, 3);
	}

}
