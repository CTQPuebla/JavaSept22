package com;

public class Hexagono extends Figura implements ICalculos {
	
	int medidaL;
	
	public Hexagono() {
		
	}

	public int getMedidaL() {
		return medidaL;
	}

	public void setMedidaL(int medidaL) {
		this.medidaL = medidaL;
	}

	

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 6*medidaL;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		double apotema = (Math.sqrt(3 * medidaL)) / 2;
		
		return 3 * medidaL * apotema;
	}

	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return this.area()*medidaL ;
	}

}
