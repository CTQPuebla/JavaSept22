package com;

public class NavajaSuiza {

	int herraminetas;
	double tamaño;
	//Atributos ojetos
	Abrebotellas abrebotellas;
	Cuchillo cuchillo;
	Tijeras tijeras;
	
	//Constructores 
	public NavajaSuiza() {	
		
	}
	public NavajaSuiza(int herraminetas, double tamaño, Abrebotellas abrebotellas, Cuchillo cuchillo, Tijeras tijeras) {
		this.herraminetas = herraminetas;
		this.tamaño = tamaño;
		this.abrebotellas = abrebotellas;
		this.cuchillo = cuchillo;
		this.tijeras = tijeras;
	}


	public int getHerraminetas() {
		return herraminetas;
	}


	public void setHerraminetas(int herraminetas) {
		this.herraminetas = herraminetas;
	}


	public double getTamaño() {
		return tamaño;
	}


	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}


	public Abrebotellas getAbrebotellas() {
		return abrebotellas;
	}


	public void setAbrebotellas(Abrebotellas abrebotellas) {
		this.abrebotellas = abrebotellas;
	}


	public Cuchillo getCuchillo() {
		return cuchillo;
	}


	public void setCuchillo(Cuchillo cuchillo) {
		this.cuchillo = cuchillo;
	}


	public Tijeras getTijeras() {
		return tijeras;
	}


	public void setTijeras(Tijeras tijeras) {
		this.tijeras = tijeras;
	}


	@Override
	public String toString() {
		return "NavajaSuiza [herraminetas=" + herraminetas + ", tamaño=" + tamaño + ", abrebotellas=" + abrebotellas
				+ ", cuchillo=" + cuchillo + ", tijeras=" + tijeras + "]";
	}

	
	
	
}
