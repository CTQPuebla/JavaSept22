package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cuadrado cu = new Cuadrado();
		Circulo ci = new Circulo();
		Hexagono hx = new Hexagono();
		
		cu.setLado(3);
		ci.setRadio(4);
		hx.setLados(7);
		
		System.out.println("El perimetro del cuadrado es: " + cu.perimetro());
		System.out.println("El area del cuadrado es: " + cu.area());
		System.out.println("El volumen del cuadrado es: " + cu.volumen());
		System.out.println();
		System.out.println("El perimetro del circulo es: " + ci.perimetro());
		System.out.println("El area del circulo es: " + ci.area());
		System.out.println("El el volumen del circulo es: " + ci.volumen());
		System.out.println();
		System.out.println("El perimetro del hexagono es: " + hx.perimetro());
		System.out.println("El area del hexagono es: " + hx.area());
		System.out.println("El volumen del hexagono es: " + hx.volumen());
	}

}
