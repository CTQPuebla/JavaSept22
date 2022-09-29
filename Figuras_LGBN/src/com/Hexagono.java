package com;

public class Hexagono extends Figura {
	
	int lado;
	double apotema;
	int largo = 10;
	
	public Hexagono () {
		
	}

	public Hexagono(int lado, double apotema) {
		super();
		this.lado = lado;
		this.apotema = apotema;
		this.largo = 10;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public double getApotema() {
		return apotema;
	}

	public void setApotema(double apotema) {
		this.apotema = apotema;
	}
	public int getLargo() {
		return 10;
	}

	public void setLargo(int largo) {
		this.largo = 10;
	}
	
	@Override
	public String toString() {
		return "Hexagono [lado=" + lado + ", apotema=" + apotema + ", largo=" + largo + "]";
	}

	public double perimetro () {
    	return this.lado*6;	
    }
    public double area () {
    	
    	this.apotema = Math.sqrt((Math.pow(lado, 2))-(Math.pow(lado, 2)/2));
    	return (this.perimetro()*this.apotema)/2;
    }
    public double volumen () {
    	return (this.lado*3*(apotema)*(largo));
    }

}
