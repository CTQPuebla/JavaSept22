package com;

public class Sacacorchos {

	String material, tama�o;
	int cantidad;

	public Sacacorchos() {
	}

	public Sacacorchos(String material, String tama�o, int cantidad) {

		this.material = material;
		this.tama�o = tama�o;
		this.cantidad = cantidad;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Sacacorchos [material=" + material + ", tama�o=" + tama�o + ", cantidad=" + cantidad + "]";
	}

}
