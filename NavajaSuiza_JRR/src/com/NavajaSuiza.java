package com;

public class NavajaSuiza {

	String fabricante;
	String color;
	String materialCubierta;
	double largo;
	double ancho;
	Navaja hojaGrande;
	Navaja cuchlla;
	boolean abrelatas;
	Destornillador destornillador;
	boolean pinzas;
	Tijera tijeras;
	Lupa lupa;
	boolean lima;
	Gancho gancho;

	public NavajaSuiza() {

	}

	public NavajaSuiza(String fabricante, String color, String materialCubierta, double largo, double ancho,
			Navaja hojaGrande, Navaja cuchlla, boolean abrelatas, Destornillador destornillador, boolean pinzas,
			Tijera tijeras, Lupa lupa, boolean lima, Gancho gancho) {
		super();
		this.fabricante = fabricante;
		this.color = color;
		this.materialCubierta = materialCubierta;
		this.largo = largo;
		this.ancho = ancho;
		this.hojaGrande = hojaGrande;
		this.cuchlla = cuchlla;
		this.abrelatas = abrelatas;
		this.destornillador = destornillador;
		this.pinzas = pinzas;
		this.tijeras = tijeras;
		this.lupa = lupa;
		this.lima = lima;
		this.gancho = gancho;
	}

	@Override
	public String toString() {
		return "NavajaSuiza [fabricante=" + fabricante + ", color=" + color + ", materialCubierta=" + materialCubierta
				+ ", largo=" + largo + ", ancho=" + ancho + ", hojaGrande=" + hojaGrande + ", cuchlla=" + cuchlla
				+ ", abrelatas=" + abrelatas + ", destornillador=" + destornillador + ", pinzas=" + pinzas
				+ ", tijeras=" + tijeras + ", lupa=" + lupa + ", lima=" + lima + ", gancho=" + gancho + "]";
	}

}
