package com;

public class Cuadrado extends Figura implements ICalculos {
	double medidaLado;
	
	public Cuadrado() {
		
	}



	public double getMedidaLado() {
		return medidaLado;
	}



	public void setMedidaLado(double medidaLado) {
		this.medidaLado = medidaLado;
	}



	@Override
	public String toString() {
		return "Cuadrado [medidaLado=" + medidaLado + "]";
	}



	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return this.medidaLado*4;
	}



	@Override
	public double area() {
		// TODO Auto-generated method stub
		return medidaLado = medidaLado * medidaLado;
	}



	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return medidaLado*medidaLado*medidaLado*medidaLado;
	}

}
