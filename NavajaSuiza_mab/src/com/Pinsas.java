package com;

public class Pinsas {

	String punta;
	String mecanicas;
	
	public Pinsas() {
		
	}

	public Pinsas(String punta, String mecanicas) {
		super();
		this.punta = punta;
		this.mecanicas = mecanicas;
	}

	public String getPunta() {
		return punta;
	}

	public void setPunta(String punta) {
		this.punta = punta;
	}

	public String getMecanicas() {
		return mecanicas;
	}

	public void setMecanicas(String mecanicas) {
		this.mecanicas = mecanicas;
	}

	@Override
	public String toString() {
		return "Pinsas [punta=" + punta + ", mecanicas=" + mecanicas + "]";
	}
	
}
