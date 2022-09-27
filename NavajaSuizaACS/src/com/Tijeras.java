package com;

public class Tijeras {
	
	int tamaño;
	String color;
	
	public Tijeras() {
		
	}
	
	public Tijeras(int tamaño, String color) {
		super();
		this.tamaño = tamaño;
		this.color = color;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Tijeras [tamaño=" + tamaño + ", color=" + color + "]";
	}
	

}
