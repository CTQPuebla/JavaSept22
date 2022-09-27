package com;

public class Destornillador {

	double tamaño;
	String tipo, material;
	
	//Constructor por default
	public Destornillador() {
		
	}

	public Destornillador(double tamaño, String tipo, String material) {
		
		this.tamaño = tamaño;
		this.tipo = tipo;
		this.material = material;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Destornillador [tamaño=" + tamaño + ", tipo=" + tipo + ", Material=" + material + "]";
	}
	
	
	
}
