package com;

public class Cuchillo {

	String material, fabricante;
	int cantidad;
	
	public Cuchillo() {
		
	}

	public Cuchillo(String material, String fabricante, int cantidad) {
		this.material = material;
		this.fabricante = fabricante;
		this.cantidad = cantidad;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Cuchillo [material=" + material + ", fabricante=" + fabricante + ", cantidad=" + cantidad + "]";
	}
	

	
}
