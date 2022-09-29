package com;

public class Camara {
	
	
	
	double tamaņoSensor;
	double zoom;
	double disfocal;
	
	//constructor
	public Camara() {
	
	}

	public Camara(double tamaņoSensor, double zoom, double disfocal) {
		
		this.tamaņoSensor = tamaņoSensor;
		this.zoom = zoom;
		this.disfocal = disfocal;
	}

	public double getTamaņoSensor() {
		return tamaņoSensor;
	}

	public void setTamaņoSensor(double tamaņoSensor) {
		this.tamaņoSensor = tamaņoSensor;
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
		return "Camara [tamaņoSensor=" + tamaņoSensor + ", zoom=" + zoom + ", disfocal=" + disfocal + "]";
	}	
	
	
	
	
}
