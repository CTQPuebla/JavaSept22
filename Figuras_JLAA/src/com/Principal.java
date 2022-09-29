package com;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuadrado cu= new Cuadrado();
		Circulo ci= new Circulo();
		Hexagono hx= new Hexagono ();
		cu.setLado(3);
		ci.setRadio(4);
		hx.setLado(7);
		
		System.out.println(cu.perimetro());
		System.out.println(cu.area());
		System.out.println(cu.volumen());
		
		System.out.println();
		
		System.out.println(ci.perimetro());
		System.out.println(ci.area());
		System.out.println(ci.volumen());
		
		System.out.println();
		
		System.out.println(hx.perimetro());
		System.out.println(hx.area());
		System.out.println(hx.volumen());

	}

}
