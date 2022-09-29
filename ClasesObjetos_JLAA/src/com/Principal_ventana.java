package com;

public class Principal_ventana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Ventana v1= new Ventana("Azul", 15, 30, "Metal", 15);
		
		Ventana v2= new Ventana("Blanca", 20, 40, "Madera", 10);
		
		
		v2.getMaterial();
		
		System.out.println(v1);
		System.out.println(v2);
		

	}

}
