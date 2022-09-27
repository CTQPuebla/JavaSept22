package com;

public class Navaja {
	//mm
	double longitud;
	//mm
	double filoCorte;
	//marca
	double marca;

	public Navaja() {
	}

	public Navaja(double longitud, double filoCorte) {
		this.longitud = longitud;
		this.filoCorte = filoCorte;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getFiloCorte() {
		return filoCorte;
	}

	public void setFiloCorte(double filoCorte) {
		this.filoCorte = filoCorte;
	}

	@Override
	public String toString() {
		return "Navaja [longitud=" + longitud + ", filoCorte=" + filoCorte + "]";
	}

}
