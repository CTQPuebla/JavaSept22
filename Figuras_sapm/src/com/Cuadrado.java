package com;

public class Cuadrado extends FigurasGeo implements ICalculos{
      double mlado;
      
      public Cuadrado() {  
      }

	public Cuadrado(double mlado) {
		super();
		this.mlado = mlado;
	}

	public double getMlado() {
		return mlado;
	}

	public void setMlado(double mlado) {
		this.mlado = mlado;
	}

	@Override
	public String toString() {
		return "Cuadrado [mlado=" + mlado + "]";
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return mlado*mlado;
	}

	@Override
	public double volumen() {
		// TODO Auto-generated method stub
		return mlado*mlado*mlado;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return this.mlado * 4;
	}
      

	
	
      
      
      
      
}
