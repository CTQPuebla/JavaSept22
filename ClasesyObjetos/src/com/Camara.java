package com;

public class Camara {
	double tama�ossensor;
	double zoom;
	double disfocal;
	
	//constructor por default
	public Camara () {

	}

	public Camara(double tama�ossensor, double zoom, double disfocal) {
		super();
		this.tama�ossensor = tama�ossensor;
		this.zoom = zoom;
		this.disfocal = disfocal;
	}

	public double getTama�ossensor() {
		return tama�ossensor;
	}

	public void setTama�ossensor(double tama�ossensor) {
		this.tama�ossensor = tama�ossensor;
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
		return "Camara [tama�ossensor=" + tama�ossensor + ", zoom=" + zoom + ", disfocal=" + disfocal + "]";
	}

	
}//publiclass
