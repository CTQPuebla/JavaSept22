package com;

public class Cuadrado extends Figura implements ICalculos{
	
	float lado;
	
	public Cuadrado() {
		
	}
	
	

	public Cuadrado(float lado) {
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
		return "Cuadrado [lado=" + lado + ", nombre=" + nombre + "]";
	}
	
	
	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return lado * 4;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return lado*lado;
	}



	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return Math.pow(lado, 3);
	}




}
