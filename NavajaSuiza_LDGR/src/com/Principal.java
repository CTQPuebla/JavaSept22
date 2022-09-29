package com;

public class Principal {
	
	public static void main(String[] args) {

		
		Pinzas p1 = new Pinzas("Aluminio", 100, 3, 1);
		Tijeras t1 = new Tijeras("Aluminio", 150, 2, 1);
		Limadeuñas l1 = new Limadeuñas("Aluminio", 120, 2.5, 1);
		
		NavajaSuiza n1 = new NavajaSuiza("Swiss", p1, t1, l1);
		System.out.println(n1);
	}
		

}
