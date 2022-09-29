package com;

public class Hexagono extends Figuras implements ICalculos{
	
	private double lado;
	private double apotema;
	private double altura;
	
    public Hexagono() {
    	
    }

	public Hexagono(double perimetro,double lado, double apotema, double altura) {
		super(perimetro);
		this.lado = lado;
		this.altura = altura;

		
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}

	
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double perimetro() {
		return lado*6;
		
	}
	
	@Override
	public double area() {
		return ((lado*6)*apotema)/2;
		
	}

	@Override
	public double volumen() {
		return (((lado*6)*apotema)/2)*altura;
	}





	

}

