package com;

public class Principal {

	public static void main(String[] args) {

		Cuadrado cu = new Cuadrado();
		Circulo cl = new Circulo();
		Hexagono hx = new Hexagono();
		
		cu.setLados(3);
		cl.setRadio(4);
		hx.setLados(7);
		 
		System.out.println(cu.perimetro());
		System.out.println(cu.area());
		System.out.println(cu.volumen());
		
		System.out.println(cl.perimetro());
		System.out.println(cl.area());
		System.out.println(cl.volumen());
		
		System.out.println(hx.perimetro());
		System.out.println(hx.area());
		System.out.println(hx.volumen());

		
	}

}
