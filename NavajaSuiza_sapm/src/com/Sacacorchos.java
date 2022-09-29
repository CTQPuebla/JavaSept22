package com;

public class Sacacorchos {

	String material, tamaño;
	int cantidad;

	public Sacacorchos() {
	}

	public Sacacorchos(String material, String tamaño, int cantidad) {

		this.material = material;
		this.tamaño = tamaño;
		this.cantidad = cantidad;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Sacacorchos [material=" + material + ", tamaño=" + tamaño + ", cantidad=" + cantidad + "]";
	}

}
