package com;

public class Circulo extends FigurasG implements ICalculos {

	double radio;
	final double pi = 3.1416;
	
	public Circulo() {
		
	}
	
	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getPi() {
		return pi;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", pi=" + pi + "]";
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		
		return pi * (radio * 2);
	}

	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return pi * (Math.pow(radio, 2));
	}

	@Override
	public double Volumen() {
		// TODO Auto-generated method stub
		return (4/3)*(Math.pow(radio, 3));
	}


}
