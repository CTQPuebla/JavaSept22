package com;

public class Material {
	
	String madera, acero, carbon;
public Material () {
	
}
public Material(String madera, String acero, String carbon) {

	this.madera = madera;
	this.acero = acero;
	this.carbon = carbon;
}
public String getMadera() {
	return madera;
}
public void setMadera(String madera) {
	this.madera = madera;
}
public String getAcero() {
	return acero;
}
public void setAcero(String acero) {
	this.acero = acero;
}
public String getCarbon() {
	return carbon;
}
public void setCarbon(String carbon) {
	this.carbon = carbon;
}
@Override
public String toString() {
	return "Material [madera=" + madera + ", acero=" + acero + ", carbon=" + carbon + "]";
}

}
