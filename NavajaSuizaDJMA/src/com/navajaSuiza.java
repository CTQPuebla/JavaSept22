package com;

public class navajaSuiza {

	String color, marca, materiales, instrumentos;
	double largo, ancho;
	int accesorios;
	
	navaja navaja;
	destapador destapador;
	lima lima;
	
	
	public navajaSuiza () {
				
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMateriales() {
		return materiales;
	}

	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}

	public String getInstrumentos() {
		return instrumentos;
	}

	public void setInstrumentos(String instrumentos) {
		this.instrumentos = instrumentos;
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

	public int getAccesorios() {
		return accesorios;
	}

	public void setAccesorios(int accesorios) {
		this.accesorios = accesorios;
	}

	public navajaSuiza(String color, String marca, String materiales, String instrumentos, double largo, double ancho,
			int accesorios) {
		super();
		this.color = color;
		this.marca = marca;
		this.materiales = materiales;
		this.instrumentos = instrumentos;
		this.largo = largo;
		this.ancho = ancho;
		this.accesorios = accesorios;
	}

	@Override
	public String toString() {
		return "navajaSuiza [color=" + color + ", marca=" + marca + ", materiales=" + materiales + ", instrumentos="
				+ instrumentos + ", largo=" + largo + ", ancho=" + ancho + ", accesorios=" + accesorios + "]";
	}


	
	
	
}
