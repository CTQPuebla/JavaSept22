package com;

public class Principal {
public static void main(String[] args) {
	
	
	Cuadrado cu = new Cuadrado ();
	Circulo ci = new Circulo ();
	Hexagono hx = new Hexagono ();
	
	cu.setLado(8);
	ci.setRadio(4);
	hx.setLado(3);
	
	System.out.println(cu.perimetro());
	System.out.println(cu.area());
	System.out.println(cu.Volumen());
	
	System.out.println(ci.perimetro());
	System.out.println(ci.area());
	System.out.println(ci.Volumen());
	
	System.out.println(hx.perimetro());
	System.out.println(hx.area());
	System.out.println(hx.Volumen());
	
	
	
	
}
}
