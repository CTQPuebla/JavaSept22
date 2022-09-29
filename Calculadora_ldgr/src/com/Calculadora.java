package com;

public abstract class Calculadora {

	String materiales, marca;
	double capacidad, precio;
	int bateria;
	
	public Calculadora() {
		
	}

	public Calculadora(String materiales, String marca, double capacidad, double precio, int bateria) {

		this.materiales = materiales;
		this.marca = marca;
		this.capacidad = capacidad;
		this.precio = precio;
		this.bateria = bateria;
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

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

	@Override
	public String toString() {
		return "Calculadora [materiales=" + materiales + ", marca=" + marca + ", capacidad=" + capacidad + ", precio="
				+ precio + ", bateria=" + bateria + "]";
	}
	
	
	abstract double suma(int a, int b);
	
	abstract double resta(int a, int b);
	
	abstract double multiplicar(int a, int b);
	
	abstract double division(int a, int b);
	
}
