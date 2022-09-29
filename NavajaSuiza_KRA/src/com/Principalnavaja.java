package com;

public class Principalnavaja {
public static void main(String[] args) {
	

	//Crear el objeto
	
		Navajasuiza n1 = new Navajasuiza();
		System.out.println(n1);
		
		n1.setMarca("Victorinox");
		n1.setColor("Roja");
		n1.setMedida(12);
		n1.setMateriales("Metal");
		
		
		System.out.println(n1);
		
		
		
		Abrelatas a1 = new Abrelatas(12.1, 8.3, 4.1);
		System.out.println(a1);
		
		Regla r1 = new Regla(3.2,1.2,6);
		System.out.println(r1);
		
		Tijeras t1 = new Tijeras(6.5, 8.2,"acero");
		System.out.println(t1);
		
		Navajasuiza n2 = new Navajasuiza("rojo", "victorinox", "acero", 6, t1 , r1, a1);
		System.out.println(n2);
		
	
	
}//main	
}//publicclass
