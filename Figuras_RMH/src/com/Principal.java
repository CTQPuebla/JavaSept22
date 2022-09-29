package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuadrado c1 = new Cuadrado();
		Circulo cir1= new Circulo();
		Hexagono h1 = new Hexagono();
		
		c1.setLado(3);
		cir1.setRadio(4);
		h1.setLado(7);
				
		System.out.println("El perimetro del cuadrado es: "+c1.perimetro());
		System.out.println("Area cuadrado: "+c1.area());
		System.out.println("Volumen cuadrado: "+ c1.volumen());
		System.out.println("\n");
		
		System.out.println("Perimetro Circulo: "+cir1.perimetro());
		System.out.println("Area circulo: "+cir1.area());
		System.out.println("Volumen circulo: "+cir1.volumen());
		System.out.println("\n");
		
		System.out.println("Perimetro hexagono: "+h1.perimetro());
		System.out.println("Area hexagono: "+h1.area());
		System.out.println("Volumen hexagono: "+h1.volumen());
		System.out.println("\n");

		

	}

}
