package com;

public abstract  class Calculadora {

    String materiales, capacidadBateria, marca;
    int precio;
    
    
    public Calculadora() {
    	
    }

	public Calculadora(String materiales, String capacidadBateria, String marca, int precio) {
		super();
		this.materiales = materiales;
		this.capacidadBateria = capacidadBateria;
		this.marca = marca;
		this.precio = precio;
	}

	public String getMateriales() {
		return materiales;
	}

	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}

	public String getCapacidadBateria() {
		return capacidadBateria;
	}

	public void setCapacidadBateria(String capacidadBateria) {
		this.capacidadBateria = capacidadBateria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Calculadora [materiales=" + materiales + ", capacidadBateria=" + capacidadBateria + ", marca=" + marca
				+ ", precio=" + precio + "]";
	}
    
	public abstract double multiplicar(int a, int b);
	
	public abstract double restar(int a, int b);
	
	public abstract double sumar(int a, int b);
    
	public abstract double dividir(int a, int b);

	
    
    
    
}
