package com;

public class Principal {
 
	public static void main (String[]args) {
	Cuadrado cd = new Cuadrado();
	Circulo cir= new Circulo();
	Hexageno hx= new Hexageno();
	
    cd.setMlado(3);
    cir.setRadio(4);
    hx.setLado(7);
    
    System.out.println("El perimetro del cuadrado es: "+cd.perimetro());
    System.out.println("El area del cuadrado es: "+cd.area());
    System.out.println("El volumen del cuadrado es: "+cd.volumen());
    System.out.println("\n");
    
    System.out.println("El perimetro del circulo es: "+cir.perimetro());
    System.out.println("El area del circulo es: "+cir.area());
    System.out.println("El volumen del circulo es: "+cir.volumen());
    System.out.println("\n");
    
    System.out.println("El perimetro del hexagono es: "+hx.perimetro());
	System.out.println("El area del hexagono es: "+hx.area());
	System.out.println("El volumen del hexagono es: "+hx.volumen());
    System.out.println("\n");
	
	}
}
