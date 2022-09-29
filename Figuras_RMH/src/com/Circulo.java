package com;

public class Circulo extends Figura implements ICalculos{
	
	float radio;
	
	public Circulo() {
		
	}

	public Circulo(float radio) {
		super();
		this.radio = radio;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", nombre=" + nombre + "]";
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*(Math.pow(radio, 2));
	}

	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return ( (Math.PI* 4) * (Math.pow(radio, 3)) /3 );
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return Math.PI * (2*radio);
	}



}
