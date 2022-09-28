package com;

public class Camara {
	
	
	
	double tamañoSensor;
	double zoom;
	double disfocal;
	
	//constructor
	public Camara() {
	
	}

	public Camara(double tamañoSensor, double zoom, double disfocal) {
		
		this.tamañoSensor = tamañoSensor;
		this.zoom = zoom;
		this.disfocal = disfocal;
	}

	public double getTamañoSensor() {
		return tamañoSensor;
	}

	public void setTamañoSensor(double tamañoSensor) {
		this.tamañoSensor = tamañoSensor;
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
		return "Camara [tamañoSensor=" + tamañoSensor + ", zoom=" + zoom + ", disfocal=" + disfocal + "]";
	}	
	
	
	
	
}
