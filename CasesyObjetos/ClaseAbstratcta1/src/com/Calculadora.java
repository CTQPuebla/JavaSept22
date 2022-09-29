package com;

public abstract class Calculadora {
	
	String materiales, marca;
	int capBateria;
	double precio;
	
	public Calculadora() {
		
	}

	public Calculadora(String materiales, String marca, int capBateria, double precio) {
		
		this.materiales = materiales;
		this.marca = marca;
		this.capBateria = capBateria;
		this.precio = precio;
	}

	public String getMateriales() {
		return materiales;
	}

	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCapBateria() {
		return capBateria;
	}

	public void setCapBateria(int capBateria) {
		this.capBateria = capBateria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Calculadora [materiales=" + materiales + ", marca=" + marca + ", capBateria=" + capBateria + ", precio="
				+ precio + "]";
	}
	
	public abstract double suma(int a, int b);
	
	public abstract double resta(int a, int b);
	
	public abstract double multiplicacion(int a, int b);
	
	public abstract double division(int a, int b);
	
	
	

}
