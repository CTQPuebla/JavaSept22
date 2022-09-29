package com;

import java.util.Date;

public class Cuenta {
	
	String Id, clave;
	Date FechaApertura;
	double saldo, min, max;
	String Status;

	public Cuenta() {
		
	}

	public Cuenta(String id, String clave, Date fechaApertura, double saldo, double min, double max, String status) {
		super();
		Id = id;
		this.clave = clave;
		FechaApertura = fechaApertura;
		this.saldo = saldo;
		this.min = min;
		this.max = max;
		Status = status;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Date getFechaApertura() {
		return FechaApertura;
	}

	public void setFechaApertura(Date fechaApertura) {
		FechaApertura = fechaApertura;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "Cuenta [Id=" + Id + ", clave=" + clave + ", saldo=" + saldo + ", min=" + min + ", max=" + max
				+ ", Status=" + Status + "]";
	}
	
}
