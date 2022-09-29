package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cuadrado cu = new Cuadrado();
		Circulo ci = new Circulo();
		Hexagono hx = new Hexagono();
		
		cu.setMedidaLado(3);
		ci.setRadio(4);
		hx.setMedidaL(7);
		
		System.out.println(cu.perimetro());
		System.out.println(cu.area());
		System.out.println(cu.volumen());
		
	}

}
