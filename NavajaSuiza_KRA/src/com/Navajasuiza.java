package com;

public class Navajasuiza {

	//Atributos
	
	String Color, Marca, Materiales;
	int medida;
	
	//Atributos de objeto
	
Tijeras tijera;
Regla regla;
Abrelatas Abrelata;



	
	@Override
public String toString() {
	return "Navajasuiza [Color=" + Color + ", Marca=" + Marca + ", Materiales=" + Materiales + ", medida=" + medida
			+ ", tijera=" + tijera + ", regla=" + regla + ", Abrelata=" + Abrelata + "]";
}

	public Tijeras getTijera() {
	return tijera;
}

public void setTijera(Tijeras tijera) {
	this.tijera = tijera;
}

public Regla getRegla() {
	return regla;
}

public void setRegla(Regla regla) {
	this.regla = regla;
}

public Abrelatas getAbrelata() {
	return Abrelata;
}

public void setAbrelata(Abrelatas abrelata) {
	Abrelata = abrelata;
}

	public Navajasuiza(String color, String marca, String materiales, int medida, Tijeras tijera, Regla regla,
		Abrelatas abrelata) {
	super();
	Color = color;
	Marca = marca;
	Materiales = materiales;
	this.medida = medida;
	this.tijera = tijera;
	this.regla = regla;
	Abrelata = abrelata;
}

	public Navajasuiza () {
		
	}

	public Navajasuiza(String color, String marca, String materiales, int medida) {

		Color = color;
		Marca = marca;
		Materiales = materiales;
		this.medida = medida;
		
	}
	
	

	

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getMateriales() {
		return Materiales;
	}

	public void setMateriales(String materiales) {
		Materiales = materiales;
	}

	public int getMedida() {
		return medida;
	}

	public void setMedida(int medida) {
		this.medida = medida;
	}

	



	
	
	

	
}//ClassNavaja
