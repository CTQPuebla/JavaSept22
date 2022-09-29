package com;

public class Hexagono extends FigurasG implements ICalculos {
	
	double lado;
	
	public Hexagono() {
		
	}
	
	public Hexagono(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Hexagono [lado=" + lado + "]";
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return lado * 6;
	}

	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return (lado*6)*(lado/1.15)/2;
	}

	@Override
	public double Volumen() {
		// TODO Auto-generated method stub
		return (lado*6) * (lado/1.15)/2 * lado;
	}

}
