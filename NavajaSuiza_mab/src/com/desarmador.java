package com;

public class desarmador {

	String plano;
	String cruz;
	
	public desarmador() {
		
	}

	public desarmador(String plano, String cruz) {
		super();
		this.plano = plano;
		this.cruz = cruz;
	}

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}

	public String getCruz() {
		return cruz;
	}

	public void setCruz(String cruz) {
		this.cruz = cruz;
	}

	@Override
	public String toString() {
		return "desarmador [plano=" + plano + ", cruz=" + cruz + "]";
	}
	
	
}
