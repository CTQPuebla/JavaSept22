package com;

public class Camara {
	
	
	
	double tama�oSensor;
	double zoom;
	double disfocal;
	
	//constructor
	public Camara() {
	
	}

	public Camara(double tama�oSensor, double zoom, double disfocal) {
		
		this.tama�oSensor = tama�oSensor;
		this.zoom = zoom;
		this.disfocal = disfocal;
	}

	public double getTama�oSensor() {
		return tama�oSensor;
	}

	public void setTama�oSensor(double tama�oSensor) {
		this.tama�oSensor = tama�oSensor;
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
		return "Camara [tama�oSensor=" + tama�oSensor + ", zoom=" + zoom + ", disfocal=" + disfocal + "]";
	}	
	
	
	
	
}
