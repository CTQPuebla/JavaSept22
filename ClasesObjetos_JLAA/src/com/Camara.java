package com;

public class Camara {
	
	double tama�oSensor;
	double zoom;
	double discLFocal;
	
	
	public Camara() {
		
	}


	public Camara(double tama�oSensor, double zoom, double discLFocal) {
	
		this.tama�oSensor = tama�oSensor;
		this.zoom = zoom;
		this.discLFocal = discLFocal;
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


	public double getDiscLFocal() {
		return discLFocal;
	}


	public void setDiscLFocal(double discLFocal) {
		this.discLFocal = discLFocal;
	}


	@Override
	public String toString() {
		return "Camara [tama�oSensor=" + tama�oSensor + ", zoom=" + zoom + ", discLFocal=" + discLFocal + "]";
	}
	
	
	
	

}
