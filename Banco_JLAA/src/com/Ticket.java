package com;

import java.util.Date;

public class Ticket {
	
	Date fechaHora;
	double saldoAnterior;
	double saldoActual;
	double cantidadOperada;
	String numeroCuenta;
	String ubicacion;
	int folioOperacion;
	int idCajero;
	
	
	
	public Ticket() {
		
	}


	public Ticket(Date fechaHora, double saldoAnterior, double saldoActual, double cantidadOperada, String numeroCuenta,
			int folioOperacion, int idCajero, String ubicacion) {
		
		this.fechaHora = fechaHora;
		this.saldoAnterior = saldoAnterior;
		this.saldoActual = saldoActual;
		this.cantidadOperada = cantidadOperada;
		this.numeroCuenta = numeroCuenta;
		this.folioOperacion = folioOperacion;
		this.idCajero = idCajero;
		this.ubicacion = ubicacion;
	}


	public Date getFechaHora() {
		return fechaHora;
	}


	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}


	public double getSaldoAnterior() {
		return saldoAnterior;
	}


	public void setSaldoAnterior(double saldoAnterior) {
		this.saldoAnterior = saldoAnterior;
	}


	public double getSaldoActual() {
		return saldoActual;
	}


	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}


	public double getCantidadOperada() {
		return cantidadOperada;
	}


	public void setCantidadOperada(double cantidadOperada) {
		this.cantidadOperada = cantidadOperada;
	}


	public String getNumeroCuenta() {
		return numeroCuenta;
	}


	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}


	public int getFolioOperacion() {
		return folioOperacion;
	}


	public void setFolioOperacion(int folioOperacion) {
		this.folioOperacion = folioOperacion;
	}


	public int getIdCajero() {
		return idCajero;
	}


	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}


	public String getUbicacion() {
		return ubicacion;
	}


	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}


	@Override
	public String toString() {
		return "Ticket. Fecha Hora=" + fechaHora + "\nsaldoAnterior=" + saldoAnterior + "\nsaldoActual=" + saldoActual
				+ "\ncantidadOperada=" + cantidadOperada + "\nnumeroCuenta=" + numeroCuenta + "\nfolioOperacion="
				+ folioOperacion + "\nidCajero=" + idCajero + "\nubicacion=" + ubicacion ;
	}
	
	
	

}
