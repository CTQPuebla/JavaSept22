package com;

public class Cuadrado extends FigurasG implements IFormula {

	// base * altura 
	
	double lados;
	
	public Cuadrado() {
		
	}

	public Cuadrado(String nombre, double lados) {
		
		this.lados = lados;
	}


	public double getLados() {
		return lados;
	}

	public void setLados(double lados) {
		this.lados = lados;
	}

	@Override
	public String toString() {
		return "Cuadrado [lados=" + lados + "]";
	}

	@Override
	public double perimetro() {
		
		return this.lados * 4;
	}

	@Override
	public double area() {
		
		return lados = lados *lados;
	}
	@Override
	public double volumen() {
		return lados*6;
}
}