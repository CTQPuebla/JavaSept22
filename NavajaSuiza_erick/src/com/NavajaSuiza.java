package com;

public class NavajaSuiza {
	
	//Atributos
	
	String Color,Marca, Materiales;
	int Medida;
	
	//Atributos de objeto
	
	Tijeras tijera;
	Regla regla;
	Lupa lupa;
	public NavajaSuiza() {
		super();
		this.tijera = tijera;
		this.regla = regla;
		this.lupa = lupa;
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
		return Medida;
	}
	public void setMedida(int medida) {
		Medida = medida;
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
	public Lupa getLupa() {
		return lupa;
	}
	public void setLupa(Lupa lupa) {
		this.lupa = lupa;
	}
	@Override
	public String toString() {
		return "NavajaSuiza [Color=" + Color + ", Marca=" + Marca + ", Materiales=" + Materiales + ", Medida=" + Medida
				+ "]";
	}
	
	
	
	
	
	
	
	
	

}
