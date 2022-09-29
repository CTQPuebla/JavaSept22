package com;

public class Hexagono extends Figuras implements figurasIcalculos{

	double medidaLado;
	
	public Hexagono() {
		
	}

	public double getMedidaLado() {
		return medidaLado;
	}

	public void setMedidaLado(double medidaLado) {
		this.medidaLado = medidaLado;
	}

	@Override
	public String toString() {
		return "Hexagono [medidaLado=" + medidaLado + "]";
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return this.medidaLado*6;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (3*(Math.sqrt(3)/2))*medidaLado*medidaLado;
	}

	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return (3 * Math.sqrt(3)* this.medidaLado * this.medidaLado * this.medidaLado) / 2;
		
	}
	
}
