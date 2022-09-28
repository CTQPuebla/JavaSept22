package com;

public class Tijeras {	
	
	
	String material;
	int partes;
	int tornillos;
	double tamaño;
	
	
	public Tijeras() {
		
}


	public Tijeras(String material, int partes, int toinillos, double tamaño) {
		
		this.material = material;
		this.partes = partes;
		this.tornillos = toinillos;
		this.tamaño = tamaño;
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


	public double getTamaño() {
		return tamaño;
	}


	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}


	@Override
	public String toString() {
		return "Tijeras [material=" + material + ", partes=" + partes + ", tornillos=" + tornillos + ", tamaño="
				+ tamaño + "]";
	}
	
	
	
}