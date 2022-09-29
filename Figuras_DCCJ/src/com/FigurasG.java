package com;

public abstract class FigurasG {

	//public double Perimetro();
	
	String Nombres;
	
	public FigurasG() {
		
	}

	public FigurasG(String nombres) {
		
		Nombres = nombres;
	}

	public String getNombres() {
		return Nombres;
	}

	public void setNombres(String nombres) {
		Nombres = nombres;
	}

	@Override
	public String toString() {
		return "FigurasG [Nombres=" + Nombres + "]";
	}
	public abstract  double perimetro();

	public double area() {
		// TODO Auto-generated method stub
		return 0;
	} 
}
