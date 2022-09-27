package com;

public class Tijeras {
	
	double tama�o;
	String tipo, material;
	
	public Tijeras() {
		
	}

	public Tijeras(double tama�o, String tipo, String material) {
		
		this.tama�o = tama�o;
		this.tipo = tipo;
		this.material = material;
	}

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
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
		return "Tijeras [tama�o=" + tama�o + ", tipo=" + tipo + ", material=" + material + "]";
	}

}
