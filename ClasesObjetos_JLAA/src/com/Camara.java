package com;

public class Camara {
	
	double tamañoSensor;
	double zoom;
	double discLFocal;
	
	
	public Camara() {
		
	}


	public Camara(double tamañoSensor, double zoom, double discLFocal) {
	
		this.tamañoSensor = tamañoSensor;
		this.zoom = zoom;
		this.discLFocal = discLFocal;
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


	public double getDiscLFocal() {
		return discLFocal;
	}


	public void setDiscLFocal(double discLFocal) {
		this.discLFocal = discLFocal;
	}


	@Override
	public String toString() {
		return "Camara [tamañoSensor=" + tamañoSensor + ", zoom=" + zoom + ", discLFocal=" + discLFocal + "]";
	}
	
	
	
	

}
