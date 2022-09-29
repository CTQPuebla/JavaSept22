package com;

public class Principal {
	
	public static void main(String[] args) {
		
		Navaja n1 = new Navaja();
		
		System.out.println(n1);
		
		n1.setBrand("hatori hanzo");
		n1.setMaterials("steel");
		n1.setColor("silver");
		n1.setLarge(12.5);
		n1.setWidth(2.1);
		n1.setNumTools(3);
		
		System.out.println(n1);
		
		Lupa l1 = new Lupa("mica", 12, 12.3);
		
		Desarmador d1 = new Desarmador("Plano", 12);
		
		SacaCorchos  sc1 = new SacaCorchos(3,"steel"); 
		
		Navaja n3 = new Navaja("HatoriHanzo", "steel", "silver", 2.1, 1.2, 3, l1, d1, sc1);
		
		System.out.println(n3);
		
		

		
		
	}

}
