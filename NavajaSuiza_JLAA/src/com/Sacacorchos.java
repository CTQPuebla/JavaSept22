package com;

public class Sacacorchos {
	
	String tipo;
	String color;
	
	public Sacacorchos() {
		
	}

	public Sacacorchos(String tipo, String color) {
		
		this.tipo = tipo;
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Sacacorchos [tipo=" + tipo + ", color=" + color + "]";
	}
	
	
	

}
