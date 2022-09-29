package com;

public class Hexagono extends FigurasGeo implements ICalculos {

	double apotema;
	double lado;
	
	
	
	

	public Hexagono(double apotema, double lado) {
		super();
		this.apotema = apotema;
		this.lado = lado;
	}




	public double getApotema() {
		return apotema;
	}




	public void setApotema(double apotema) {
		this.apotema = apotema;
	}




	public double getLado() {
		return lado;
	}




	public void setLado(double lado) {
		this.lado = lado;
	}




	@Override
	public String toString() {
		return "Hexagono [apotema=" + apotema + ", lado=" + lado + "]";
	}




	@Override
	public double area() {
		// TODO Auto-generated method stub
	double apotema = (Math.sqrt(3*lado)) / 2;
		return 3*lado*apotema;
	}

	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return this.area()*lado;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 6*lado;
	}

}
