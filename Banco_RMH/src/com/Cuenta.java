package com;

import java.util.Date;

public class Cuenta {
	
	String id, nip;
	double saldo, min, max;
	Date fechaapertura;
	boolean status;
	
	public Cuenta() {
		
	}
	
	public Cuenta(String id, String nip, double saldo, double min, double max, Date fechaapertura, boolean status) {
		super();
		this.id = id;
		this.nip = nip;
		this.saldo = saldo;
		this.min = min;
		this.max = max;
		this.fechaapertura = fechaapertura;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", nip=" + nip + ", saldo=" + saldo + ", min=" + min + ", max=" + max
				+ ", fechaapertura=" + fechaapertura + ", status=" + status + "]";
	}
	
	
	

}
