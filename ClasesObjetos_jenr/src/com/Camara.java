package com;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Camara {
	
	double tamaņoSensor;
	double zoom;
	double distFocal;
	
public Camara () {
	
}

public Camara(double tamaņoSensor, double zoom, double distFocal) {
	
	this.tamaņoSensor = tamaņoSensor;
	this.zoom = zoom;
	this.distFocal = distFocal;
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

public double getDistFocal() {
	return distFocal;
}

public void setDistFocal(double distFocal) {
	this.distFocal = distFocal;
}

@Override
public String toString() {
	return "Camara [tamaņoSensor=" + tamaņoSensor + ", zoom=" + zoom + ", distFocal=" + distFocal + "]";
}

}
