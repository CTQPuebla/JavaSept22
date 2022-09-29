package com;

public class Hexagono extends Figuras implements Icalculo{
	
	int lados;

	public Hexagono() {

	}

	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}

	@Override
	public String toString() {
		return "Hexagono [lados=" + lados + "]";
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		double apotema = (Math.sqrt(3*lados)) / 2;
		return 3*lados*apotema;
	}

	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return this.area()*lados;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 6*lados;
	}


	
}
