package com;

public class Camara {
	
	double tamañoSensor;
	double zoom;
	double distFocal;
	
	//Constructor por default
	public Camara() {
		
		
		
	}

	public Camara(double tamañoSensor, double zoom, double distFocal) {
	
		this.tamañoSensor = tamañoSensor;
		this.zoom = zoom;
		this.distFocal = distFocal;
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

	public double getDistFocal() {
		return distFocal;
	}

	public void setDistFocal(double distFocal) {
		this.distFocal = distFocal;
	}

	@Override
	public String toString() {
		return "Camara [tamañoSensor=" + tamañoSensor + ", zoom=" + zoom + ", distFocal=" + distFocal + "]";
	}
	
	

}
