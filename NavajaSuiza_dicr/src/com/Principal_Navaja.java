package com;

public class Principal_Navaja {

	public static void main(String[] args) {
		//Crear objeto 
		NavajaSuiza na1 = new NavajaSuiza();
		System.out.println(na1);
		
		na1.setColor("Roja");
		na1.setMarca("Victorinox");
		na1.setFabricante("yeye");
		na1.setTamaño(5.0);
		
		System.out.println(na1);
		
		
		Cuchillo cu1 = new Cuchillo("Metal", "yeyen", 4);
		Destornillador des1 = new Destornillador("Cruz", 10, 1);
		Sacacorchos sa1 = new Sacacorchos("Metal","Chico", 2);
		NavajaSuiza na2 = new NavajaSuiza("Amarillo", "yeyen", "Xi", 5.2, cu1, des1, sa1);
		System.out.println(na2);
		
	}	
	
	

}
