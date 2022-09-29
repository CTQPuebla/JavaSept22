package com;

public class Circulo extends Figuras implements Icalculo{
	
	double radio;
	
	public Circulo() {
		
	}

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}



	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*(2*radio);
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return Math.PI*(Math.pow(radio, 2));
	}

	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return Math.PI * (2*radio);
	}


	//return 1.33 *(math.pi*(math.pow(radio,3)));
	
}
