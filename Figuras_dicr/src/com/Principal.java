package com;

public class Principal {
	
	public static void main (String[] args ) {
	
	Cuadrado cu = new Cuadrado();
	Circulo ci = new Circulo(0);
	Hexagono hx = new Hexagono(0, 0);
	
	cu.setmLado(3);

	ci.setRadio(4);
	
	hx.setLado(7);
	
	
	System.out.println("El perimetro del cuadrado es: "+cu.perimetro());
	System.out.println("El area del cuadro es:" +cu.area());
	System.out.println("El volumen del cuadrado es: "+cu.volumen());
	System.out.println("\n");
	
	
	System.out.println("El perimetro del circulo es: "+ci.perimetro());
	System.out.println("El area del circulo es:" +ci.area());
	System.out.println("El volumen del circulo es:" +ci.volumen());
	System.out.println("\n");
	
	
	System.out.println("El perimetro del hexagono es: "+ hx.perimetro());
	System.out.println("El area del hexagono es: "+ hx.area());
	System.out.println("El volumen del hexagono es: "+ hx.volumen());
	}

}
