package com;

import java.util.Date;

public class Ticket {

	Date fecha;
	double salAnterior,salActual,cantidadOperada;
	String NumeroDecuenta, ubicacion;
	int FolioOperacion,idCajero;
	
	public Ticket(Date fecha, double salAnterior, double salActual, double cantidadOperada, String numeroDecuenta,
			String ubicacion, int folioOperacion, int idCajero) {
		
		this.fecha = fecha;
		this.salAnterior = salAnterior;
		this.salActual = salActual;
		this.cantidadOperada = cantidadOperada;
		NumeroDecuenta = numeroDecuenta;
		this.ubicacion = ubicacion;
		FolioOperacion = folioOperacion;
		this.idCajero = idCajero;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getSalAnterior() {
		return salAnterior;
	}
	public void setSalAnterior(double salAnterior) {
		this.salAnterior = salAnterior;
	}
	public double getSalActual() {
		return salActual;
	}
	public void setSalActual(double salActual) {
		this.salActual = salActual;
	}
	public double getCantidadOperada() {
		return cantidadOperada;
	}
	public void setCantidadOperada(double cantidadOperada) {
		this.cantidadOperada = cantidadOperada;
	}
	public String getNumeroDecuenta() {
		return NumeroDecuenta;
	}
	public void setNumeroDecuenta(String numeroDecuenta) {
		NumeroDecuenta = numeroDecuenta;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getFolioOperacion() {
		return FolioOperacion;
	}
	public void setFolioOperacion(int folioOperacion) {
		FolioOperacion = folioOperacion;
	}
	public int getIdCajero() {
		return idCajero;
	}
	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}
	@Override
	public String toString() {
		return "Ticket [fecha=" + fecha + ",\nsalAnterior=" + salAnterior + ", \nsalActual=" + salActual
				+ ", \ncantidadOperada=" + cantidadOperada + ", \nNumeroDecuenta=" + NumeroDecuenta + ", \nubicacion="
				+ ubicacion + ", \nFolioOperacion=" + FolioOperacion + ", \nidCajero=" + idCajero + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
