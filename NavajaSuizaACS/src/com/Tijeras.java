package com;

public class Tijeras {
	
	int tama�o;
	String color;
	
	public Tijeras() {
		
	}
	
	public Tijeras(int tama�o, String color) {
		super();
		this.tama�o = tama�o;
		this.color = color;
	}

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Tijeras [tama�o=" + tama�o + ", color=" + color + "]";
	}
	

}
