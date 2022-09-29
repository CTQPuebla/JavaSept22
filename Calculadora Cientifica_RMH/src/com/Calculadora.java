package com;

public abstract class Calculadora {
	
	String marca,materiales,bateria;
	float precio;
	
	public Calculadora() {
		
	}

	public Calculadora(String marca, String materiales, String bateria, float precio) {
		super();
		this.marca = marca;
		this.materiales = materiales;
		this.bateria = bateria;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMateriales() {
		return materiales;
	}

	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}

	public String getBateria() {
		return bateria;
	}

	public void setBateria(String bateria) {
		this.bateria = bateria;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", materiales=" + materiales + ", bateria=" + bateria + ", precio="
				+ precio + "]";
	}
	
	
	public abstract double sumar(int a, int b);
	
	public abstract double restar(int a, int b);
	
	public abstract double multiplicar(int a, int b);
	
	public abstract double dividir(int a, int b);

}
