package com;

public abstract  class Calculadora {
	 String materiales,marca;
	 float capacidaddebateria,precio;
	 
	 
	 public Calculadora() {
		 
	 }


	public Calculadora(String materiales, String marca, float capacidaddebateria, float precio) {
		
		this.materiales = materiales;
		this.marca = marca;
		this.capacidaddebateria = capacidaddebateria;
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


	public float getCapacidaddebateria() {
		return capacidaddebateria;
	}


	public void setCapacidaddebateria(float capacidaddebateria) {
		this.capacidaddebateria = capacidaddebateria;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Calculadora [materiales=" + materiales + ", marca=" + marca + ", capacidaddebateria="
	+ capacidaddebateria + ", precio=" + precio + "]";
		
		
	}
	public abstract double sumar (int a,int b);
	public abstract double restar (int a, int b);
	public abstract double multiplicar (int a,int b);
	public abstract double dividir (int a, int b);
	
	 
	

}//main

