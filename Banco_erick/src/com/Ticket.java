package com;

import java.util.Date;

public class Ticket {

	Date fecha;
	double saldoAnterior, saldoActual, cantidadOperada;
	String numeroCuenta, ubicacion;
	int folioOperacoin, idCajero;
	
	
	public Ticket() {
		
	}


	public Ticket(Date fecha, double saldoAnterior, double saldoActual, double cantidadOperada, String numeroCuenta,
			String ubicacion, int folioOperacoin, int idCajero) {
		super();
		this.fecha = fecha;
		this.saldoAnterior = saldoAnterior;
		this.saldoActual = saldoActual;
		this.cantidadOperada = cantidadOperada;
		this.numeroCuenta = numeroCuenta;
		this.ubicacion = ubicacion;
		this.folioOperacoin = folioOperacoin;
		this.idCajero = idCajero;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
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


	public String getUbicacion() {
		return ubicacion;
	}


	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}


	public int getFolioOperacoin() {
		return folioOperacoin;
	}


	public void setFolioOperacoin(int folioOperacoin) {
		this.folioOperacoin = folioOperacoin;
	}


	public int getIdCajero() {
		return idCajero;
	}


	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}


	@Override
	public String toString() {
		return "Ticket [fecha=" + fecha + ", \nsaldoAnterior=" + saldoAnterior + ", \nsaldoActual=" + saldoActual
				+ ", \ncantidadOperada=" + cantidadOperada + ", \nnumeroCuenta=" + numeroCuenta + ", \nubicacion=" + ubicacion
				+ ", \nfolioOperacoin=" + folioOperacoin + ", \nidCajero=" + idCajero + "]";
	}
	
	
	
	
	
	
}
