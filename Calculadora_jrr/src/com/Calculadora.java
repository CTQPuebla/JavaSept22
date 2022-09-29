package com;

public abstract class Calculadora {

	String materiales;
	String capacidadBateria;
	String marca;
	String precio;

	public Calculadora() {
	}

	public Calculadora(String materiales, String capacidadBateria, String marca, String precio) {
		this.materiales = materiales;
		this.capacidadBateria = capacidadBateria;
		this.marca = marca;
		this.precio = precio;
	}

	public String getMateriales() {
		return materiales;
	}

	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}

	public String getCapacidadBateria() {
		return capacidadBateria;
	}

	public void setCapacidadBateria(String capacidadBateria) {
		this.capacidadBateria = capacidadBateria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Calculadora [materiales=" + materiales + ", capacidadBateria=" + capacidadBateria + ", marca=" + marca
				+ ", precio=" + precio + "]";
	}

	public abstract double sumar(double a, double b);

	public abstract double restar(double a, double b);

	public abstract double multiplicar(double a, double b);

	public abstract double dividir(double a, double b);
}
