package com;

public class Tijera {
	String tipo;
	double longitud;

	public Tijera() {
	}

	public Tijera(String tipo, double longitud) {
		this.tipo = tipo;
		this.longitud = longitud;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "Tijera [tipo=" + tipo + ", longitud=" + longitud + "]";
	}

}
