package com;

public class Cuadrado extends Figura implements ICalculos{

	double lado;
	
	Cuadrado (){
		
	}

	public Cuadrado(double lado) {
		
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
		return "Cuadrado [lado=" + lado + "]";
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return this.lado*4;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.lado*lado;
	}

	@Override
	public double Volumen() {
		// TODO Auto-generated method stub
		return this.lado*lado*lado;
	}
	
	
} 
