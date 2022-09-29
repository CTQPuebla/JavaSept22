package com;

public class Camara {
	//Creando atributos de la clase
	double tamaņoSensor; 
	double zoom;
	double distFocal;
	
	//Constructor por default
	public Camara() {
		
	}
// Generate constructor with fields
	public Camara(double tamaņoSensor, double zoom, double distFocal) {
		//super(); Se borra el super
		this.tamaņoSensor = tamaņoSensor;
		this.zoom = zoom;
		this.distFocal = distFocal;
	}
	//Generar el getter and setter
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
	public double getDistFocal() {
		return distFocal;
	}
	public void setDistFocal(double distFocal) {
		this.distFocal = distFocal;
	}
	//Generate to String
	@Override
	public String toString() {
		return "Camara [tamaņoSensor=" + tamaņoSensor + ", zoom=" + zoom + ", distFocal=" + distFocal + "]";
	}
	
	
	
	

	

}
