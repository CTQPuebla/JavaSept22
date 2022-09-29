package com;

public class Cuadrado extends FiguraG implements ICalculos{
	int lado=4;

	public Cuadrado() {
		
	}

	public Cuadrado(int lado) {
		
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
		return "Cuadrado [lado=" + lado + "]";
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return this.lado*4;
	}

	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return this.lado*4;
	}

	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return this.lado*lado*4;
	}

	
	

}//
