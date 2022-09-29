package com;

public class Hexagono extends Figura implements ICalculos{
    
	int lado;
	
	public Hexagono() {
		
	}

	public Hexagono(int lado) {
		super();
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Hexagono [lado=" + lado + "]";
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return this.lado*6;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (Math.sqrt(3*lado))/2;
	}

	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return (3*Math.sqrt(3))*(this.lado*this.lado)/2;
	}
	
}
