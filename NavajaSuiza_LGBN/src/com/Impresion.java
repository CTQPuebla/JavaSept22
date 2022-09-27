package com;

public class Impresion {
	public static void main(String[ ] args) {
		
//		NavajaSuiza n1 = new NavajaSuiza();		
//		System.out.println(n1);
		
		Desarmadores des1 = new Desarmadores("CRUZ", "CHICO", 2);
		Cortantes cort1 = new Cortantes("NAVAJA", "GRANDE", 1);
		Extras ext1 = new Extras("LUPA", "MEDIO", 1);
		
		
		NavajaSuiza n2 = new NavajaSuiza("ROJO","PLASTICO Y METAL" ,"MULTIUSOS", 22, des1, cort1, ext1);
		System.out.println(n2);
		

		
	}
}
