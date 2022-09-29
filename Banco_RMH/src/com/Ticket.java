package com;

import java.util.Date;

public class Ticket {
	Date fecha;
	double saldoAnterior, saldoActual, cantidadOperada;
	String cuenta, folio, idcajero,ubicacion;
	
	public Ticket() {
		
	}
	
	
	public Ticket(Date fecha, double saldoAnterior, double saldoActual, double cantidadOperada, String cuenta,
			String folio, String idcajero, String ubicacion) {
		super();
		this.fecha = fecha;
		this.saldoAnterior = saldoAnterior;
		this.saldoActual = saldoActual;
		this.cantidadOperada = cantidadOperada;
		this.cuenta = cuenta;
		this.folio = folio;
		this.idcajero = idcajero;
		this.ubicacion = ubicacion;
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
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public String getFolio() {
		return folio;
	}
	public void setFolio(String folio) {
		this.folio = folio;
	}
	public String getIdcajero() {
		return idcajero;
	}
	public void setIdcajero(String idcajero) {
		this.idcajero = idcajero;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	@Override
	public String toString() {
		return "Ticket Fecha=" + fecha + ", \nsaldoAnterior=" + saldoAnterior + ", \nSaldoActual=" + saldoActual
				+ " \nCantidadOperada=" + cantidadOperada + "\nCuenta=" + cuenta + "\nFolio=" + folio + "\nidcajero="
				+ idcajero + "\nUbicacion=" + ubicacion + "";
	}
	
	

	
	

}
