package com;

public class PrincipalFiguras {
	public static void main(String[] args) { 
		
		Cuadrado cu = new Cuadrado();
		Circulo ci = new Circulo();
		Hexagono he = new Hexagono();
		
		cu.setLado(3);
		ci.setRadio(4);
		he.setLado(7);
		
		System.out.println("Perimetro del cuadrado:"+cu.perimetro());
		System.out.println("Area del cuadrado:"+cu.area());
		System.out.println("Volumen del cuadrado:"+cu.volumen()+"\n");
		
		System.out.println("Perimetro del circulo:"+ci.perimetro());
		System.out.println("Area del circulo:"+ci.area());
		System.out.println("Perimetro del circulo:"+ci.volumen()+"\n");
		
		System.out.println("Perimetro del hexagono:"+he.perimetro());
		System.out.println("Area del hexagono:"+he.area());
		System.out.println("Volumen del hexagono:"+he.volumen());
		
		
		
		
		
		
	}

}
