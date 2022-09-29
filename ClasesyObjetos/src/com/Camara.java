package com;

public class Camara {
	double tamañossensor;
	double zoom;
	double disfocal;
	
	//constructor por default
	public Camara () {

	}

	public Camara(double tamañossensor, double zoom, double disfocal) {
		super();
		this.tamañossensor = tamañossensor;
		this.zoom = zoom;
		this.disfocal = disfocal;
	}

	public double getTamañossensor() {
		return tamañossensor;
	}

	public void setTamañossensor(double tamañossensor) {
		this.tamañossensor = tamañossensor;
	}

	public double getZoom() {
		return zoom;
	}

	public void setZoom(double zoom) {
		this.zoom = zoom;
	}

	public double getDisfocal() {
		return disfocal;
	}

	public void setDisfocal(double disfocal) {
		this.disfocal = disfocal;
	}

	@Override
	public String toString() {
		return "Camara [tamañossensor=" + tamañossensor + ", zoom=" + zoom + ", disfocal=" + disfocal + "]";
	}

	
}//publiclass
