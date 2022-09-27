package com;

public class PrincipalNavajaSuiza {
	public static void main(String[] args) {
		
	
		// Crear el objeto
		
		NavajaSuiza n1=new NavajaSuiza();
		System.out.println(n1);
		n1.setDestornillador("Plano");
		n1.setTijeras("De corte");
		n1.setCuchillo(" De cierra");
	    n1.setAncho(4);
		n1.setLargo(8);
		System.out.println(n1);
	    
		NavajaSuiza n2 =new NavajaSuiza("Plano", "De corte", "De cierra", 4, 8);
		
	}
	

	
	
	

}//main
