package com;

public class NavajaSuiza {
	
String color,marca,fabricante;

Cuchillo cuchillo;
Destornillador destornillador;
Sacacorchos sacacorchos;



public NavajaSuiza () {
}



public NavajaSuiza(String color, String marca, String fabricante) {

	this.color = color;
	this.marca = marca;
	this.fabricante = fabricante;
	
}



public NavajaSuiza(String color, String marca, String fabricante, Cuchillo cuchillo, Destornillador destornillador,
		Sacacorchos sacacorchos) {
	super();
	this.color = color;
	this.marca = marca;
	this.fabricante = fabricante;
	this.cuchillo = cuchillo;
	this.destornillador = destornillador;
	this.sacacorchos = sacacorchos;
}



public String getColor() {
	return color;
}



public void setColor(String color) {
	this.color = color;
}



public String getMarca() {
	return marca;
}



public void setMarca(String marca) {
	this.marca = marca;
}



public String getFabricante() {
	return fabricante;
}



public void setFabricante(String fabricante) {
	this.fabricante = fabricante;
}



public Cuchillo getCuchillo() {
	return cuchillo;
}



public void setCuchillo(Cuchillo cuchillo) {
	this.cuchillo = cuchillo;
}



public Destornillador getDestornillador() {
	return destornillador;
}



public void setDestornillador(Destornillador destornillador) {
	this.destornillador = destornillador;
}



public Sacacorchos getSacacorchos() {
	return sacacorchos;
}



public void setSacacorchos(Sacacorchos sacacorchos) {
	this.sacacorchos = sacacorchos;
}



@Override
public String toString() {
	return "NavajaSuiza [color=" + color + ", marca=" + marca + ", fabricante=" + fabricante + ", cuchillo=" + cuchillo
			+ ", destornillador=" + destornillador + ", sacacorchos=" + sacacorchos + "]";
}


}