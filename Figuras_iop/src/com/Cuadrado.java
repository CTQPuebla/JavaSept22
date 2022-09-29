package com;

public class Cuadrado extends Figuras implements ICalculos{

	private double lado;
	
	public Cuadrado() {
		
	}


	public Cuadrado(double perimetro, double lado) {
		super(perimetro);
		this.lado = lado;
		
	}


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}



	@Override
	public double perimetro() {
		return lado*4;
	}


	@Override
	public double area() {
		return lado*lado;
	}


	@Override
	public double volumen() {
		return Math.pow(lado, 3);
		
	}
	
	



	
	



   
	
}
