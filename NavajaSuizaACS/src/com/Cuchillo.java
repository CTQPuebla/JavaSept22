package com;

public class Cuchillo {

	double tama�o, ancho;
	
	public Cuchillo() {
		
	}
	
	public Cuchillo(double tama�o, double ancho) {
		super();
		this.tama�o = tama�o;
		this.ancho = ancho;
	}

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	@Override
	public String toString() {
		return "Cuchillo [tama�o=" + tama�o + ", ancho=" + ancho + "]";
	}
	
}
