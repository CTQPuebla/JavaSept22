package com;

import java.util.Date;

public class Ticket {
	
	Date fecha;
	double  saldoAnterior, saldoActual, cantidadOperada;
	String ubicacion, numeroCuenta;
	int operacion, idCajero;
	
public Ticket() {
		
	}

public Ticket(Date fecha, double saldoAnterior, double saldoActual, double cantidadOperada, String ubicacion,
		String numeroCuenta, int operacion, int idCajero) {
	super();
	this.fecha = fecha;
	this.saldoAnterior = saldoAnterior;
	this.saldoActual = saldoActual;
	this.cantidadOperada = cantidadOperada;
	this.ubicacion = ubicacion;
	this.numeroCuenta = numeroCuenta;
	this.operacion = operacion;
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

public String getUbicacion() {
	return ubicacion;
}

public void setUbicacion(String ubicacion) {
	this.ubicacion = ubicacion;
}

public String getNumeroCuenta() {
	return numeroCuenta;
}

public void setNumeroCuenta(String numeroCuenta) {
	this.numeroCuenta = numeroCuenta;
}

public int getOperacion() {
	return operacion;
}

public void setOperacion(int operacion) {
	this.operacion = operacion;
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
			+ ", \ncantidadOperada=" + cantidadOperada + ", \nubicacion=" + ubicacion + ", \nnumeroCuenta=" + numeroCuenta
			+ ", \noperacion=" + operacion + ", \nidCajero=" + idCajero + "]";
}

	
	
}
