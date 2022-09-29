package com;

public class NavajaSuiza {

	String marca;
	Pinzas pinza;
	Tijeras tijera;
	Limadeuñas lima;
	
	public NavajaSuiza() {
		
	}

	public NavajaSuiza(String marca, Pinzas pinza, Tijeras tijera, Limadeuñas lima) {
		super();
		this.marca = marca;
		this.pinza = pinza;
		this.tijera = tijera;
		this.lima = lima;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Pinzas getPinza() {
		return pinza;
	}

	public void setPinza(Pinzas pinza) {
		this.pinza = pinza;
	}

	public Tijeras getTijera() {
		return tijera;
	}

	public void setTijera(Tijeras tijera) {
		this.tijera = tijera;
	}

	public Limadeuñas getLima() {
		return lima;
	}

	public void setLima(Limadeuñas lima) {
		this.lima = lima;
	}

	@Override
	public String toString() {
		return "NavajaSuiza [marca=" + marca + ", pinza=" + pinza + ", tijera=" + tijera + ", lima=" + lima + "]";
	}
	
	
}
