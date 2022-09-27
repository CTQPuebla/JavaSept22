package com;

public class NavajaSuiza {
	
	String color;
	String material;
	String tipo;
	int utilidades;
	
	Desarmadores desarmadores;
	Cortantes cortantes;
	Extras extras;
	
	public NavajaSuiza () {
		
	}

	public NavajaSuiza(String color, String material, String tipo, int utilidades) {
		this.color = color;
		this.material = material;
		this.tipo = tipo;
		this.utilidades = utilidades;
	}
	
	

	public NavajaSuiza(String color, String material, String tipo, int utilidades, Desarmadores desarmadores,
			Cortantes cortantes, Extras extras) {
		this.color = color;
		this.material = material;
		this.tipo = tipo;
		this.utilidades = utilidades;
		this.desarmadores = desarmadores;
		this.cortantes = cortantes;
		this.extras = extras;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getUtilidades() {
		return utilidades;
	}

	public void setUtilidades(int utilidades) {
		this.utilidades = utilidades;
	}

	@Override
	public String toString() {
		return "NavajaSuiza [color=" + color + ", material=" + material + ", tipo=" + tipo + ", utilidades="
				+ utilidades + ", desarmadores=" + desarmadores + ", cortantes=" + cortantes + ", extras=" + extras
				+ "]";
	}

	
	
	
	

}
