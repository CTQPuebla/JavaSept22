package com;

public class Desarmador {

	String material;
	String color;
	int piesas;
	String forma;
	
	
	public Desarmador() {
	}


	public Desarmador(String material, String color, int piesas, String forma) {
		
		this.material = material;
		this.color = color;
		this.piesas = piesas;
		this.forma = forma;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getPiesas() {
		return piesas;
	}


	public void setPiesas(int piesas) {
		this.piesas = piesas;
	}


	public String getForma() {
		return forma;
	}


	public void setForma(String forma) {
		this.forma = forma;
	}


	@Override
	public String toString() {
		return "Desarmador [material=" + material + ", color=" + color + ", piesas=" + piesas + ", forma=" + forma
				+ "]";
	}
	
	
}
