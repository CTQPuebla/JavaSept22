package com;

public abstract class Calculadora {

	String Materials , Marca;
	double Precio;
	int Bateria;
	
	public Calculadora(){
		
	}

	public Calculadora(String materials, String marca, double precio, int bateria) {
		
		Materials = materials;
		Marca = marca;
		Precio = precio;
		Bateria = bateria;
	}

	public String getMaterials() {
		return Materials;
	}

	public void setMaterials(String materials) {
		Materials = materials;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public int getBateria() {
		return Bateria;
	}

	public void setBateria(int bateria) {
		Bateria = bateria;
	}

	@Override
	public String toString() {
		return "Materiales [Materials=" + Materials + ", Marca=" + Marca + ", Precio=" + Precio + ", Bateria=" + Bateria
				+ "]";
	}

	
	public abstract double multiplicar(int a , int b);
	public abstract double restar(int a , int b);
	public abstract double sumar(int a , int b);
	public abstract double dividir(int a , int b);
	
	

}
