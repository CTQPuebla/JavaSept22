package com;

import java.util.Date;

public class Cuenta {
	
	String id, clave;
	double saldo,min,max;
	Date fechadeapertura;
	int status;
	public Cuenta(String id, String clave, double saldo, double min, double max, Date fechadeapertura, int status) {
		
		this.id = id;
		this.clave = clave;
		this.saldo = saldo;
		this.min = min;
		this.max = max;
		this.fechadeapertura = fechadeapertura;
		this.status = status;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public Date getFechadeapertura() {
		return fechadeapertura;
	}
	public void setFechadeapertura(Date fechadeapertura) {
		this.fechadeapertura = fechadeapertura;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", clave=" + clave + ", saldo=" + saldo + ", min=" + min + ", max=" + max
				+ ", fechadeapertura=" + fechadeapertura + ", status=" + status + "]";
	}
	
	
	
	
	}