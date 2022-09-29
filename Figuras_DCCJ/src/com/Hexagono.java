package com;

public class Hexagono extends FigurasG implements IFormula {


	double Lados;
	
	public Hexagono() {
		
	}

	public Hexagono(String nombre, double lados) {
		
		Lados = lados;
	}

	public double getLados() {
		return Lados;
	}

	public void setLados(double lados) {
		Lados = lados;
	}

	@Override
	public String toString() {
		return "Hexagono [Lados=" + Lados + "]";
	}

	@Override
	 public double area() {
		
	   double apotema = (Math.sqrt(3*Lados)) / 2;
	  return 3*Lados*apotema;
	 }

	 @Override
	 public double volumen() {
		 
	  return this.area()*Lados;
	 }

	 @Override
	 public double perimetro() {
		 
	  return 6*Lados;
	 }
	}

