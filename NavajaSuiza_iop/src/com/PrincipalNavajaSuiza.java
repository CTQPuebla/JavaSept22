package com;

public class PrincipalNavajaSuiza {

	public static void main(String[] args) {

		// Crear el Objeto
//		NavajaSuiza n1 = new NavajaSuiza("Rojo", "Acero inoxidable0", "Victorinox", 8, 3);
		NavajaSuiza n1 = new NavajaSuiza("Rojo", "Acero inoxidable", "Victorinox", 8, 3);
		System.out.println(n1);
		
		Destornillador d1 = new Destornillador("Acero inoxidable", "Cruz", 4);
		Abrelatas a1 = new Abrelatas("Acero inoxidable", 4);
		Tijeras t1 = new Tijeras("Acero inoxidable", 3);
		HojaGrande h1 = new HojaGrande("Acero inoxidable", 4);
		
		NavajaSuiza n2 = new NavajaSuiza("Azul", "Plata", "Caso", 10, 4, d1, a1, t1, h1);
		System.out.println(n2);
		
		
		
	}
	
	

}
