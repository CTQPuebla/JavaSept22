package com;

public class Camara {
	//Creando atributos de la clase
	double tama�oSensor; 
	double zoom;
	double distFocal;
	
	//Constructor por default
	public Camara() {
		
	}
// Generate constructor with fields
	public Camara(double tama�oSensor, double zoom, double distFocal) {
		//super(); Se borra el super
		this.tama�oSensor = tama�oSensor;
		this.zoom = zoom;
		this.distFocal = distFocal;
	}
	//Generar el getter and setter
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
	public double getDistFocal() {
		return distFocal;
	}
	public void setDistFocal(double distFocal) {
		this.distFocal = distFocal;
	}
	//Generate to String
	@Override
	public String toString() {
		return "Camara [tama�oSensor=" + tama�oSensor + ", zoom=" + zoom + ", distFocal=" + distFocal + "]";
	}
	
	
	
	

	

}
