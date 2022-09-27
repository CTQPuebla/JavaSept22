package com;

public class Principal_Navaja {
	public static void main(String[] args) {
	
  NavajaSuiza n1 = new NavajaSuiza();
  System.out.println(n1);
	  
  n1.setColor("Roja");
  n1.setMarca("Xi");
  n1.setFabricante("Yeyen");
  System.out.println(n1);
  
  
  
 Cuchillo c1 = new Cuchillo("fierro","Yeyen",4);
 Destornillador d1 = new Destornillador ("Cruz",10,1);
 Sacacorchos s1= new Sacacorchos("Fierro","chico",1);
 NavajaSuiza n2 = new NavajaSuiza("Rosa","Yeyen","Xi",c1,d1,s1);
 System.out.println(n2);
}
	
	
}
