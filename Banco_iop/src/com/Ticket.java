package com;

import java.util.Date;

public class Ticket {

	Date fecha;
	double saldoAnterior, saldoActual, cantidadOperar;
	String numeroCuenta, ubicacion;
	int folioOperacion, idCajero;
	
	public Ticket() {
	}

	public Ticket(Date fecha, double saldoAnterior, double saldoActual, double cantidadOperar, String numeroCuenta,
			String ubicacion, int folioOperacion, int idCajero) {
		super();
		this.fecha = fecha;
		this.saldoAnterior = saldoAnterior;
		this.saldoActual = saldoActual;
		this.cantidadOperar = cantidadOperar;
		this.numeroCuenta = numeroCuenta;
		this.ubicacion = ubicacion;
		this.folioOperacion = folioOperacion;
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

	public double getCantidadOperar() {
		return cantidadOperar;
	}

	public void setCantidadOperar(double cantidadOperar) {
		this.cantidadOperar = cantidadOperar;
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

	@Override
	public String toString() {
		return "\nTicket \nBienvenido a Bisa Bank \nFecha = " + fecha + " \nSaldo Anterior = " + saldoAnterior + " \nSaldo Actual = " + saldoActual
				+ " \nCantidad a Operar = " + cantidadOperar + " \nNumero de Cuenta = " + numeroCuenta + " \nUbicacion = " + ubicacion
				+ " \nFolio de Operacion = " + folioOperacion + " \nID de Cajero = " + idCajero + "\nGracias por visitar Bisa Bank";
	}


	
	
}
