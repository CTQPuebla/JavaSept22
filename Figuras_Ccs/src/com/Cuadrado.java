package com;

public class Cuadrado extends FigurasG implements ICalculos {
	
	int lado;
	
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
		return  lado * 4;
	}

	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return lado * lado;
	}

	@Override
	public double Volumen() {
		// TODO Auto-generated method stub
		return lado * lado * lado;
	}

}
