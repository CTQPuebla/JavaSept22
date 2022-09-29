package com;

public abstract class Calculadora {

	
	String material,marca;
	double precio;
	int bateria;
	
	
	public Calculadora() {
		
	}


	public Calculadora(String material, String marca, double precio, int bateria) {
		
		this.material = material;
		this.marca = marca;
		this.precio = precio;
		this.bateria = bateria;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
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


	public int getBateria() {
		return bateria;
	}


	public void setBateria(int bateria) {
		this.bateria = bateria;
	}


	@Override
	public String toString() {
		return "Calculadora [material=" + material + ", marca=" + marca + ", precio=" + precio + ", bateria=" + bateria
				+ "]";
	}
	
	
	
	
	
	
	
	
}
