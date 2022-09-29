package com;

public class Camara {
	//Creando atributos de la clase
	double tamañoSensor; 
	double zoom;
	double distFocal;
	
	//Constructor por default
	public Camara() {
		
	}
// Generate constructor with fields
	public Camara(double tamañoSensor, double zoom, double distFocal) {
		//super(); Se borra el super
		this.tamañoSensor = tamañoSensor;
		this.zoom = zoom;
		this.distFocal = distFocal;
	}
	//Generar el getter and setter
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
	//Generate to String
	@Override
	public String toString() {
		return "Camara [tamañoSensor=" + tamañoSensor + ", zoom=" + zoom + ", distFocal=" + distFocal + "]";
	}
	
	
	
	

	

}
