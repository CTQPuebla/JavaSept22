package com;

public class Hexagono extends Figuras implements ICalculosHexagono {
	
	double nLado;
	
	public Hexagono () {
		
	}

	
	
	
	
	public double getnLado() {
		return nLado;
	}





	public void setnLado(double nLado) {
		this.nLado = nLado;
	}





	@Override
	public String toString() {
		return "Hexagono [nLado=" + nLado + "]";
	}





	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return this.nLado*6;
	}





	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (3*(Math.sqrt(3)/2))*nLado*nLado;
	}

	 



	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return (3 * Math.sqrt(3) * this.nLado * this.nLado * this.nLado) / 2;
	}

}
