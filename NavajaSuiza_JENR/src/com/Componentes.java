package com;

public class Componentes {
	
	String navaja;
	String tijeras;
    String desarmador;

    public Componentes () {
    	
    }

	public Componentes(String navaja, String tijeras, String desarmador) {
		this.navaja = navaja;
		this.tijeras = tijeras;
		this.desarmador = desarmador;
	}

	public String getNavaja() {
		return navaja;
	}

	public void setNavaja(String navaja) {
		this.navaja = navaja;
	}

	public String getTijeras() {
		return tijeras;
	}

	public void setTijeras(String tijeras) {
		this.tijeras = tijeras;
	}

	public String getDesarmador() {
		return desarmador;
	}

	public void setDesarmador(String desarmador) {
		this.desarmador = desarmador;
	}

	@Override
	public String toString() {
		return "Componentes [navaja=" + navaja + ", tijeras=" + tijeras + ", desarmador=" + desarmador + "]";
	}
	
}