package com;

public abstract class  Calculadora {
	
	String materiales, bateria, marca;
	double precio;
	
	public Calculadora() {
		
	}

	public Calculadora(String materiales, String bateria, String marca, double precio) {
		super();
		this.materiales = materiales;
		this.bateria = bateria;
		this.marca = marca;
		this.precio = precio;
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Calculadora [materiales=" + materiales + ", bateria=" + bateria + ", marca=" + marca + ", precio="
				+ precio + "]";
	}
	
	public abstract double sumar(int a, int b);
	
	public abstract double restar(int a, int b);
	
	public abstract double multiplicar(int a, int b);
	
	public abstract double dividir(int a, int b);

}
