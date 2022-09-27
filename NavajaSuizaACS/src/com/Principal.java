package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		NavajaSuiza n1 = new NavajaSuiza();
		System.out.println(n1);
		
		n1.setHerraminetas(14);
		n1.setTamaño(12.5);
	
		System.out.println(n1);
		
		//Crear un objeto para agregar otro constructor 	->Objetos que forman parte de Table
		Cuchillo c1 = new Cuchillo(20, 5 );
		System.out.println(c1);
		Tijeras t1 = new Tijeras(10, "Rojo");
		System.out.println(t1);
		Abrebotellas a1 = new Abrebotellas(4, 5, "Rojo");
		System.out.println(a1);
	
		NavajaSuiza nn = new NavajaSuiza(14, 12.5, a1, c1, t1) ;
		System.out.println(nn);
		

	}

}
