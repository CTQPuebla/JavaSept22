package com;

public abstract class  Calculadora {
	
	String materiales;
	int bateria;
	double precio;
	String marca;
	
	public Calculadora() {
	
		
		
	}

	public Calculadora(String materiales, int bateria, double precio, String marca) {
	
		this.materiales = materiales;
		this.bateria = bateria;
		this.precio = precio;
		this.marca = marca;
	}

	public String getMateriales() {
		return materiales;
	}

	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public abstract double multiplicar (int a, int b);
	
	public abstract double division (int a, int b);
	
	public abstract double suma (int a, int b);
	
	public abstract double resta (int a, int b);
		
	}
	


