package com;

public class Camara {
	
	double tamaņoSensor;
	double zoom;
	double discLFocal;
	
	
	public Camara() {
		
	}


	public Camara(double tamaņoSensor, double zoom, double discLFocal) {
	
		this.tamaņoSensor = tamaņoSensor;
		this.zoom = zoom;
		this.discLFocal = discLFocal;
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


	public double getDiscLFocal() {
		return discLFocal;
	}


	public void setDiscLFocal(double discLFocal) {
		this.discLFocal = discLFocal;
	}


	@Override
	public String toString() {
		return "Camara [tamaņoSensor=" + tamaņoSensor + ", zoom=" + zoom + ", discLFocal=" + discLFocal + "]";
	}
	
	
	
	

}
