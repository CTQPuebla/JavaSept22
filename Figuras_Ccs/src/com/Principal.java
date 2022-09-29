package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circulo circulo = new Circulo();
		circulo.setRadio(6);
		System.out.println(circulo + "Su Perimetro es: " + circulo.perimetro() );
		System.out.println(circulo + "Su Area es: " + circulo.Area());
		System.out.println(circulo + "Su Volumen es: " + circulo.Volumen());
		
		Cuadrado cuadrado = new Cuadrado();
		cuadrado.setLado(6);
		System.out.println(cuadrado + "Su Perimetro es: "+ cuadrado.perimetro());
		System.out.println(cuadrado + "Su Area es: " + cuadrado.Area());
		System.out.println(cuadrado + "Su Volumen es: " + cuadrado.Volumen());
		
		Hexagono hexagono = new Hexagono();
		hexagono.setLado(6);
		System.out.println(hexagono + "Su Perimetro es: " + hexagono.perimetro());
		System.out.println(hexagono + "Su Area es: " + hexagono.Area());
		System.out.println(hexagono + "Su volumen es: " + hexagono.Volumen());

	}

} 
