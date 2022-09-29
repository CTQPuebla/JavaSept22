package com;

public class Camara {
	double tamaņossensor;
	double zoom;
	double disfocal;
	
	//constructor por default
	public Camara () {

	}

	public Camara(double tamaņossensor, double zoom, double disfocal) {
		super();
		this.tamaņossensor = tamaņossensor;
		this.zoom = zoom;
		this.disfocal = disfocal;
	}

	public double getTamaņossensor() {
		return tamaņossensor;
	}

	public void setTamaņossensor(double tamaņossensor) {
		this.tamaņossensor = tamaņossensor;
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
		return "Camara [tamaņossensor=" + tamaņossensor + ", zoom=" + zoom + ", disfocal=" + disfocal + "]";
	}

	
}//publiclass
