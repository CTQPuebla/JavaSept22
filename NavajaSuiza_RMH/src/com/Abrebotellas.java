package com;

public class Abrebotellas {
	//Atributos
	String material;
	double tamaño;
	//Constructor
	public Abrebotellas() {
		
	}
//Contructor con atributos
	public Abrebotellas(String material, double tamaño) {
		//super();
		this.material = material;
		this.tamaño = tamaño;
	}
//Generar getter and setter
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}
//Generar to String
	@Override
	public String toString() {
		return "Abrebotellas [material=" + material + ", tamaño=" + tamaño + "]";
	}
	
	
	

}
