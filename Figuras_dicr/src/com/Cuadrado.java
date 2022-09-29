package com;

public class Cuadrado extends FigurasGeo implements ICalculos{

	double mLado;
	
	public Cuadrado() {
		
	}

	public Cuadrado(double mLado) {
		this.mLado = mLado;
	}

	public double getmLado() {
		return mLado;
	}

	public void setmLado(double mLado) {
		this.mLado = mLado;
	}

	@Override
	public String toString() {
		return "Cuadrado [mLado=" + mLado + "]";
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return mLado * mLado ;
	}

	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return mLado*mLado*mLado;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return this.mLado *4;
	}
	
	
	
	
	
}
