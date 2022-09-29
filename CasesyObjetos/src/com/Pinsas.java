package com;

public class Pinsas {

	String material;
	String piesas;
	String color;
	int taquete;
	
	
	
public Pinsas() {	
	
}



public Pinsas(String material, String piesas, String color, int taquete) {
	
	this.material = material;
	this.piesas = piesas;
	this.color = color;
	this.taquete = taquete;
}



public String getMaterial() {
	return material;
}



public void setMaterial(String material) {
	this.material = material;
}



public String getPiesas() {
	return piesas;
}



public void setPiesas(String piesas) {
	this.piesas = piesas;
}



public String getColor() {
	return color;
}



public void setColor(String color) {
	this.color = color;
}



public int getTaquete() {
	return taquete;
}



public void setTaquete(int taquete) {
	this.taquete = taquete;
}



@Override
public String toString() {
	return "Pinsas [material=" + material + ", piesas=" + piesas + ", color=" + color + ", taquete=" + taquete + "]";
}

     



}