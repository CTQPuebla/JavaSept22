package com;

public class Pricipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Navaja n1 = new Navaja();
		System.out.println(n1);
		
		n1.setMarca("z");
		n1.setColor("rojo");
		n1.setMaterial("metal");
		n1.setLargo(2);
		n1.setAncho(3);
		n1.setAccesorios(3);
		
		System.out.println(n1);
		Navaja n2 = new Navaja ("azul", "w", "aluminio", 5, 4, 3);
		System.out.println(n2);
	
	
	desarmador d1= new desarmador("plano", "cruz");
	Pinsas p1= new Pinsas("punta", "mecanicas");
	
	Navaja n3 = new Navaja("plata","d","plastico", 5, 7, 3, d1, p1);
	System.out.println(n3);
	
	//Navaja n3 = new Navaja("d","plata", "plastico", 5, 7, 3, d1, p1);
	//System.out.println(n3);

}
}