package com;

public class Navaja {
	
	String brand, materials, color;
	double large, width;
	int numTools;
	
	Lupa lupa;
	Desarmador desarmador;
	SacaCorchos sacaCorchos;
	
	public Navaja() {
		
	}
	
	
	
	
	
	
	public Navaja(String brand, String materials, String color, double large, double width, int numTools, Lupa lupa,
			Desarmador desarmador, SacaCorchos sacaCorchos) {
		super();
		this.brand = brand;
		this.materials = materials;
		this.color = color;
		this.large = large;
		this.width = width;
		this.numTools = numTools;
		this.lupa = lupa;
		this.desarmador = desarmador;
		this.sacaCorchos = sacaCorchos;
	}

	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}public String getMaterials() {
		return materials;
	}
	public void setMaterials(String materials) {
		this.materials = materials;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public double getLarge() {
		return large;
	}
	public void setLarge(double large) {
		this.large = large;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public int getNumTools() {
		return numTools;
	}
	public void setNumTools(int numTools) {
		this.numTools = numTools;
	}
	public Lupa getLupa() {
		return lupa;
	}
	public void setLupa(Lupa lupa) {
		this.lupa = lupa;
	}

	public Desarmador getDesarmador() {
		return desarmador;
	}
	public void setDesarmador(Desarmador desarmador) {
		this.desarmador = desarmador;
	}
	public SacaCorchos getSacaCorchos() {
		return sacaCorchos;
	}
	public void setSacaCorchos(SacaCorchos sacaCorchos) {
		this.sacaCorchos = sacaCorchos;
	}






	@Override
	public String toString() {
		return "Navaja [brand=" + brand + ", materials=" + materials + ", color=" + color + ", large=" + large
				+ ", width=" + width + ", numTools=" + numTools + ", lupa=" + lupa + ", desarmador=" + desarmador
				+ ", sacaCorchos=" + sacaCorchos + "]";
	}
	
	}
	
	
	
	
	


