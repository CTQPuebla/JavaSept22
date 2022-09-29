package com;

public class Principal {

	public static void main(String[] args) {
		Cuadrado f1 = new Cuadrado(5);
		System.out.println(f1);
		System.out.println(" Perimetro: "+f1.perimetro());
		System.out.println(" 햞ea: "+f1.area());
		System.out.println(" Volumen: "+f1.volumen());

		System.out.println("***** ***** ***** ***** *****");
		
		Cuadrado f2 = new Cuadrado(12.5);
		System.out.println(f2);
		System.out.println(" Perimetro: "+f2.perimetro());
		System.out.println(" 햞ea: "+f2.area());
		System.out.println(" Volumen: "+f2.volumen());
		
		System.out.println("***** ***** ***** ***** *****");
		
		Circulo f3 = new Circulo(5.7);
		System.out.println(f3);
		System.out.println(" Perimetro: "+f3.perimetro());
		System.out.println(" 햞ea: "+f3.area());
		System.out.println(" Volumen: "+f3.volumen());

		System.out.println("***** ***** ***** ***** *****");
		
		Circulo f4 = new Circulo(12.5);
		System.out.println(f4);
		System.out.println(" Perimetro: "+f4.perimetro());
		System.out.println(" 햞ea: "+f4.area());
		System.out.println(" Volumen: "+f4.volumen());
		
		System.out.println("***** ***** ***** ***** *****");
		
		Hexagono f5 = new Hexagono (6);
		System.out.println(f5);
		System.out.println(" Perimetro: "+f5.perimetro());
		System.out.println(" 햞ea: "+f5.area());
		System.out.println(" Volumen: "+f5.volumen());

		System.out.println("***** ***** ***** ***** *****");
		
		Hexagono f6 = new Hexagono (8.75);
		System.out.println(f6);
		System.out.println(" Perimetro: "+f6.perimetro());
		System.out.println(" 햞ea: "+f6.area());
		System.out.println(" Volumen: "+f6.volumen());
		
		System.out.println("***** ***** ***** ***** *****");
		
	}
}
