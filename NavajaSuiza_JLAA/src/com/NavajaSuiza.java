package com;

public class NavajaSuiza {

	
	String marca;
	String color;
	
	Sacacorchos  Sacacorchos;
	Pinzas Pinzas;
	PelaCables PelaCables;
	
	
	
	public NavajaSuiza() {
		
	}



	public NavajaSuiza(String marca, String color) {
	
		this.marca = marca;
		this.color = color;
	}
	



	public NavajaSuiza(String marca, String color, com.Sacacorchos sacacorchos, com.Pinzas pinzas,
			com.PelaCables pelaCables) {
		super();
		this.marca = marca;
		this.color = color;
		Sacacorchos = sacacorchos;
		Pinzas = pinzas;
		PelaCables = pelaCables;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	@Override
	public String toString() {
		return "NavajaSuiza [marca=" + marca + ", color=" + color + ", Sacacorchos=" + Sacacorchos + ", Pinzas="
				+ Pinzas + ", PelaCables=" + PelaCables + "]";
	}
	
	
	
	
	

}
