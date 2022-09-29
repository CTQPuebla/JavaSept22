package com;

public class ClasePrincipal {
	
public static void main(String[] args) {
	
	
	Cuadrado cua = new Cuadrado();
	Circulo cir = new Circulo();
	Hexagonal hex= new Hexagonal();
	
	cua.setLado(4);
	cir.setR(12);
	hex.setLado(6);
	
	 System.out.println(cua.perimetro());
	 System.out.println(cua.Area());
	 System.out.println(cua.volumen());
	 System.out.println();
	 
	 System.out.println(cir.perimetro());
	 System.out.println(cir.Area());
	 System.out.println(cir.volumen());
	 System.out.println();
	 
	 System.out.println(hex.perimetro());
	 System.out.println(hex.Area());
	 System.out.println(hex.volumen());
	
	
	
}//main
	

}//class
