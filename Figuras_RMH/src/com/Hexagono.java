package com;

public class Hexagono extends Figura implements ICalculos{
	
	float lado;
	
	public Hexagono() {
		
	}

	public Hexagono(float lado) {
		super();
		this.lado = lado;
	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Hexagono [lado=" + lado + ", nombre=" + nombre + "]";
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
