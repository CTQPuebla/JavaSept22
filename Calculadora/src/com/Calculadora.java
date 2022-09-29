package com;

public abstract class Calculadora {
	
	String materiales,marca;
	int capacidadBateria;
	int precio;
	
	public Calculadora() {
		
	}
	
	
	public Calculadora(String materiales, String marca, int capacidadBateria, int precio) {
		super();
		this.materiales = materiales;
		this.marca = marca;
		this.capacidadBateria = capacidadBateria;
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



	public int getCapacidadBateria() {
		return capacidadBateria;
	}



	public void setCapacidadBateria(int capacidadBateria) {
		this.capacidadBateria = capacidadBateria;
	}



	public int getPrecio() {
		return precio;
	}



	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
	@Override
	public String toString() {
		return "Calculadora [materiales=" + materiales + ", marca=" + marca + ", capacidadBateria=" + capacidadBateria
				+ ", precio=" + precio + "]";
	}


	public abstract double sumar(int a, int b);
	
	public abstract double restar(int a, int b);
	
	public abstract double multiplicar(int a, int b);
	
	public abstract double dividir(int a, int b);
	
	

}
