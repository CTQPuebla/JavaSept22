package com;

public class Tijeras {	
	
	
	String material;
	int partes;
	int tornillos;
	double tama�o;
	
	
	public Tijeras() {
		
}


	public Tijeras(String material, int partes, int toinillos, double tama�o) {
		
		this.material = material;
		this.partes = partes;
		this.tornillos = toinillos;
		this.tama�o = tama�o;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public int getPartes() {
		return partes;
	}


	public void setPartes(int partes) {
		this.partes = partes;
	}


	public int getTornillos() {
		return tornillos;
	}


	public void setTornillos(int tornillos) {
		this.tornillos = tornillos;
	}


	public double getTama�o() {
		return tama�o;
	}


	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}


	@Override
	public String toString() {
		return "Tijeras [material=" + material + ", partes=" + partes + ", tornillos=" + tornillos + ", tama�o="
				+ tama�o + "]";
	}
	
	
	
}