package com;

public class NavajaSuiza {

	// Attributes
	String color, material, marca;
	double largo, ancho;
	Destornillador destornillador;
	Abrelatas abrelatas;
	Tijeras tijeras;
	HojaGrande hojagrande;
	

	// Constructor
	public NavajaSuiza() {

	}


	public NavajaSuiza(String color, String material, String marca, double largo, double ancho) {
		super();
		this.color = color;
		this.material = material;
		this.marca = marca;
		this.largo = largo;
		this.ancho = ancho;
	}


	public NavajaSuiza(String color, String material, String marca, double largo, double ancho,
			Destornillador destornillador, Abrelatas abrelatas, Tijeras tijeras, HojaGrande hojagrande) {
		super();
		this.color = color;
		this.material = material;
		this.marca = marca;
		this.largo = largo;
		this.ancho = ancho;
		this.destornillador = destornillador;
		this.abrelatas = abrelatas;
		this.tijeras = tijeras;
		this.hojagrande = hojagrande;
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


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getLargo() {
		return largo;
	}


	public void setLargo(double largo) {
		this.largo = largo;
	}


	public double getAncho() {
		return ancho;
	}


	public void setAncho(double ancho) {
		this.ancho = ancho;
	}


	public Destornillador getDestornillador() {
		return destornillador;
	}


	public void setDestornillador(Destornillador destornillador) {
		this.destornillador = destornillador;
	}


	public Abrelatas getAbrelatas() {
		return abrelatas;
	}


	public void setAbrelatas(Abrelatas abrelatas) {
		this.abrelatas = abrelatas;
	}


	public Tijeras getTijeras() {
		return tijeras;
	}


	public void setTijeras(Tijeras tijeras) {
		this.tijeras = tijeras;
	}


	public HojaGrande getHojagrande() {
		return hojagrande;
	}


	public void setHojagrande(HojaGrande hojagrande) {
		this.hojagrande = hojagrande;
	}


	@Override
	public String toString() {
		return "NavajaSuiza [color=" + color + ", material=" + material + ", marca=" + marca + ", largo=" + largo
				+ ", ancho=" + ancho + ", destornillador=" + destornillador + ", abrelatas=" + abrelatas + ", tijeras="
				+ tijeras + ", hojagrande=" + hojagrande + "]";
	}



}
