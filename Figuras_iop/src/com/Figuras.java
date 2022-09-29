package com;

public abstract class Figuras {

	private double perimetro;
	
	public Figuras(){
		
	}

	public Figuras(double perimetro) {
		this.perimetro = perimetro;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	@Override
	public String toString() {
		return "Figuras [perimetro=" + perimetro + "]";
	}
	
	public abstract double perimetro();

	
}
