package com;

public class Pinzas {

	String material;
	double peso;
	double altura;
	int piezas;
	
	public Pinzas(){
		
	}

	public Pinzas(String material, double peso, double altura, int piezas) {
		super();
		this.material = material;
		this.peso = peso;
		this.altura = altura;
		this.piezas = piezas;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public int getPiezas() {
		return piezas;
	}

	public void setPiezas(int piezas) {
		this.piezas = piezas;
	}

	@Override
	public String toString() {
		return "Pinzas [material=" + material + ", peso=" + peso + ", altura=" + altura + ", piezas=" + piezas + "]";
	}
	
	
}
