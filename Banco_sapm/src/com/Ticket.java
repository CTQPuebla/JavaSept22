package com;

import java.util.Date;

public class Ticket {
	Date fecha;
	double saldoAnterior, saldoActual,cantidadOperada;
	String numeroCuenta;
	int folioOperacion,idCajero;
	
public Ticket() {
	
}

public Ticket(Date fecha, double saldoAnterior, double saldoActual, double cantidadOperada, String numeroCuenta,
		int folioOperacion, int idCajero) {
	super();
	this.fecha = fecha;
	this.saldoAnterior = saldoAnterior;
	this.saldoActual = saldoActual;
	this.cantidadOperada = cantidadOperada;
	this.numeroCuenta = numeroCuenta;
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

@Override
public String toString() {
	return "Ticket [fecha=" + fecha + ", \nsaldoAnterior=" + saldoAnterior + ", \nsaldoActual=" + saldoActual
			+ ", \ncantidadOperada=" + cantidadOperada + ", \nnumeroCuenta=" + numeroCuenta + ", \nfolioOperacion="
			+ folioOperacion + ", \nidCajero=" + idCajero + "]";
}

}
