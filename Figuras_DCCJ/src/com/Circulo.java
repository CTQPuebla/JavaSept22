package com;

public class Circulo extends FigurasG implements IFormula {

	//A= PI por Radios al cuadrado          return  1.33 *(math.pi *(math.pow(radio,3)));
	
	
	int Radio;
	 
	public Circulo() {
		
	}

	public Circulo(String nombre, int radio) {
		
		
		Radio = radio;
	}


	public int getRadio() {
		return Radio;
	}

	public void setRadio(int radio) {
		Radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [Radio=" + Radio + "]";
	}

	@Override
	public double perimetro() {
		
		return  Math.PI *2;
	}

	@Override
	public double area() {
		return Math.PI*(Math.pow(Radio,2));
	}

	@Override
	public double volumen() {
		return 1.33 *(Math.PI *(Math.pow(Radio,3)));
	}
	
	
}
