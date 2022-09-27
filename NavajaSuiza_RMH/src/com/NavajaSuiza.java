package com;

public class NavajaSuiza {
	//Atributos
	double altura, longitud, peso;
	String material, marca;
	//Atributos objeto
	Destornillador destornillador;
	Cuchillas cuchillas;
	Abrebotellas abrebotellas;
	//consttructor
	public NavajaSuiza() {
		
	}
	//constructor con atributos
	public NavajaSuiza(double altura, double longitud, double peso, String material, String marca,
			Destornillador destornillador, Cuchillas cuchillas, Abrebotellas abrebotellas) {
		//super();
		this.altura = altura;
		this.longitud = longitud;
		this.peso = peso;
		this.material = material;
		this.marca = marca;
		this.destornillador = destornillador;
		this.cuchillas = cuchillas;
		this.abrebotellas = abrebotellas;
	}
	//Set y Get
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Destornillador getDestornillador() {
		return destornillador;
	}
	public void setDestornillador(Destornillador destornillador) {
		this.destornillador = destornillador;
	}
	public Cuchillas getCuchillas() {
		return cuchillas;
	}
	public void setCuchillas(Cuchillas cuchillas) {
		this.cuchillas = cuchillas;
	}
	public Abrebotellas getAbrebotellas() {
		return abrebotellas;
	}
	public void setAbrebotellas(Abrebotellas abrebotellas) {
		this.abrebotellas = abrebotellas;
	}
	//Generar to string para mostrar atributos
	@Override
	public String toString() {
		return "NavajaSuiza [altura=" + altura + ", longitud=" + longitud + ", peso=" + peso + ", material=" + material
				+ ", marca=" + marca + ", destornillador=" + destornillador + ", cuchillas=" + cuchillas
				+ ", abrebotellas=" + abrebotellas + "]";
	}
	
	
	

}
