package com;

public class Abrebotellas {
	//Atributos
	String material;
	double tama�o;
	//Constructor
	public Abrebotellas() {
		
	}
//Contructor con atributos
	public Abrebotellas(String material, double tama�o) {
		//super();
		this.material = material;
		this.tama�o = tama�o;
	}
//Generar getter and setter
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}
//Generar to String
	@Override
	public String toString() {
		return "Abrebotellas [material=" + material + ", tama�o=" + tama�o + "]";
	}
	
	
	

}
