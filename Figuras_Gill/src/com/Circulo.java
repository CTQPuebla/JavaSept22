package com;

public class Circulo extends FiguraG implements ICalculos {
	double r =12;
	
	
	public Circulo() {
		
	}


	public Circulo(double r) {
		
		this.r = r;
	}


	public double getR() {
		return r;
	}


	public void setR(double r) {
		this.r = r;
	}


	@Override
	public String toString() {
		return "Circulo [r=" + r + "]";
	}


	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return Math.PI*((12*2));
	}


	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return Math.PI*(Math.pow(12, 2));
	}


	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return 1.33*(Math.pow(12, 3));
	}
	
	
	

}//
