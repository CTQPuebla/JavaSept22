package com;

public class Carro {
	//Atributos
	
	String Marca,Modelo,Color,Componentes;
	int LLantas, Puertas,A�o;
	float Motor;
	int Cilindros;
	// Constructor
	public Carro() {// vacio
		
	}
	
	public Carro(String marca, String modelo, String color, String componentes, int lLantas, int puertas, int a�o,
			float motor, int cilindros) {
		super();
		Marca = marca;
		Modelo = modelo;
		Color = color;
		Componentes = componentes;
		LLantas = lLantas;
		Puertas = puertas;
		A�o = a�o;
		Motor = motor;
		Cilindros = cilindros;
	}
	// Setter- entrada(establecen un valor en un atributo)
	// uno de los  metodo  1.- viod que basicamente no devuelve nada	
		// metodo entrada
	
	
	
	//Getter-salida(devuelve un valor)
	

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getComponentes() {
		return Componentes;
	}

	public void setComponentes(String componentes) {
		Componentes = componentes;
	}

	public int getLLantas() {
		return LLantas;
	}

	public void setLLantas(int lLantas) {
		LLantas = lLantas;
	}

	public int getPuertas() {
		return Puertas;
	}

	public void setPuertas(int puertas) {
		Puertas = puertas;
	}

	public int getA�o() {
		return A�o;
	}

	public void setA�o(int a�o) {
		A�o = a�o;
	}

	public float getMotor() {
		return Motor;
	}

	public void setMotor(float motor) {
		Motor = motor;
	}

	public float getCilindros() {
		return Cilindros;
	}

	public void setCilindros(int cilindros) {
		Cilindros = cilindros;
	
}

	@Override
	public String toString() {
		return "Carro [Marca=" + Marca + ", Modelo=" + Modelo + ", Color=" + Color + ", Componentes=" + Componentes
				+ ", LLantas=" + LLantas + ", Puertas=" + Puertas + ", A�o=" + A�o + ", Motor=" + Motor + ", Cilindros="
				+ Cilindros + "]";
	}
	
	

}
