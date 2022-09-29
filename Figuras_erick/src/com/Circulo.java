package com;

public class Circulo extends Figuras implements figurasIcalculos{
	
	int radio;
	
	public Circulo() {
		
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	@Override
	public double perimetro() {
		
		// TODO Auto-generated method stub
		return (2*Math.PI)*radio;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return  Math.PI*(Math.pow(radio,2));
	}

	@Override
	public double volumen() {
		
		// TODO Auto-generated method stub
		return 1.33*(Math.pow(radio,3));
	}

}
