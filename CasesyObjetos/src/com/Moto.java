package com;

public class Moto {

	
	/*1
	 * color------ String
	 * largo----double
	 * alto-------double
	 * llantas-----int
	 * materiales------String
	 * componentes------String
	 * luces--------int
	 * frenos---------int
	 * cables------int
	 * motor-------int
	 * marca-------String
	 */
	//Atributos
	String color,materiales,componentes,marca;
	double largo,alto;
	int llantas,luces,frenos,cables,motor;
	
	
	//Constructor 
	public Moto() {
	}
	public Moto(String color, String materiales, String componentes, String marca, double largo, double alto,
			int llantas, int luces, int frenos, int cables, int motor) {
		
		this.color = color;
		this.materiales = materiales;
		this.componentes = componentes;
		this.marca = marca;
		this.largo = largo;
		this.alto = alto;
		this.llantas = llantas;
		this.luces = luces;
		this.frenos = frenos;
		this.cables = cables;
		this.motor = motor;
		
	}
	//setter - Entrada
	
	public void setColor(String color) {
		this.color= color;
	}
		 
	//Getter - salida
	public String getColor() {
		// dar salida
		return color;
	}
	public String getMateriales() {
		return materiales;
	}
	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}
	public String getComponentes() {
		return componentes;
	}
	public void setComponentes(String componentes) {
		this.componentes = componentes;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	}
	public double getAlto() {
		return alto;
	}
	public void setAlto(double alto) {
		this.alto = alto;
	}
	public int getLlantas() {
		return llantas;
	}
	public void setLlantas(int llantas) {
		this.llantas = llantas;
	}
	public int getLuces() {
		return luces;
	}
	public void setLuces(int luces) {
		this.luces = luces;
	}
	public int getFrenos() {
		return frenos;
	}
	public void setFrenos(int frenos) {
		this.frenos = frenos;
	}
	public int getCables() {
		return cables;
	}
	public void setCables(int cables) {
		this.cables = cables;
	}
	public int getMotor() {
		return motor;
	}
	public void setMotor(int motor) {
		this.motor = motor;
	}
	@Override
	public String toString() {
		return "Moto [color=" + color + ", materiales=" + materiales + ", componentes=" + componentes + ", marca="
				+ marca + ", largo=" + largo + ", alto=" + alto + ", llantas=" + llantas + ", luces=" + luces
				+ ", frenos=" + frenos + ", cables=" + cables + ", motor=" + motor + "]";
	}	
	
	
	
	}

	

