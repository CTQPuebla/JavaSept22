package com;

public class Desarmador {
	
	String type;
	int large;
	
	public Desarmador() {
		
	}

	public Desarmador(String type, int large) {
		
		this.type = type;
		this.large = large;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getLarge() {
		return large;
	}

	public void setLarge(int large) {
		this.large = large;
	}

	@Override
	public String toString() {
		return "Desarmador [type=" + type + ", large=" + large + "]";
	}
	

}
