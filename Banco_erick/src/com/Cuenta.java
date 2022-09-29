package com;

import java.util.Date;

public class Cuenta {
  
	//Atributos
	String Id,clave;
	double saldo, min, max;
	Date fechaapertura;
	String status;
	
	public Cuenta () {
		
		
	}

	public Cuenta(String id, String clave, double saldo, double min, double max, Date fechaapertura, String status) {
		super();
		Id = id;
		this.clave = clave;
		this.saldo = saldo;
		this.min = min;
		this.max = max;
		this.fechaapertura = fechaapertura;
		this.status = status;
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

	public Date getFechaapertura() {
		return fechaapertura;
	}

	public void setFechaapertura(Date fechaapertura) {
		this.fechaapertura = fechaapertura;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Cuenta [Id=" + Id + ", clave=" + clave + ", saldo=" + saldo + ", min=" + min + ", max=" + max
				+ ", fechaapertura=" + fechaapertura + ", status=" + status + "]";
	}
	
	
	
	
	

}
