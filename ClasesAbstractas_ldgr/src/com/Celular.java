package com;

public abstract class Celular {
	
	String numero;
	String modelo, marca;
	
	public Celular() {
		
	}

	public Celular(String numero, String modelo, String marca) {
		super();
		this.numero = numero;
		this.modelo = modelo;
		this.marca = marca;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Celular [numero=" + numero + ", modelo=" + modelo + ", marca=" + marca + "]";
	}
	
	
	public abstract void mandarMensaje();

	
}
