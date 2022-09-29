package com;

class Cuadrado extends FiguraG implements ICalculos{

	double lado;
	
	public Cuadrado() {
		
		
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
		return this.lado*this.lado;
	}

	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return  this.lado*this.lado*this.lado;
	}

}
