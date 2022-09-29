package com;


public class PrincipalGeometria {

	public static void main(String[] args) {
		
		Cuadrado cu = new Cuadrado();
		Circulo ci = new Circulo();
		Hexagono hx = new Hexagono();
		
		cu.setLado(3);
		ci.setRadio(4);
		ci.setAltura(5);
		hx.setLado(7);
		hx.setAltura(8);
		
		
		System.out.println("El perimetro del cuadrado es: "+String.format("%2f", cu.perimetro())+"\n");
		System.out.println("El area del cuadrado es: "+cu.area()+"\n");
		System.out.println("El volumen del cubo es: "+cu.volumen()+"\n");
		
		System.out.println("El perimetro del circulo es: "+String.format("%2f", ci.perimetro())+"\n");
		System.out.println("El area del circulo es: "+String.format("%2f", ci.area())+"\n");
		System.out.println("El volumen del cilindro es: "+ci.volumen()+"\n");
		
		System.out.println("El perimetro del hexagono es: "+ hx.perimetro()+"\n");
		System.out.println("El area del hexagono es: "+hx.area()+"\n");
		System.out.println("El volumen del prisma recto es: "+hx.volumen()+"\n");
	}
}
