package com;

public class Principal {
	public static void main(String[] args) {
		
		ClasePrueba claseP = new ClasePrueba("hola", 20, 30.6);
		claseP.imprimiMensaje();
		
		
		claseP.getAtributoB();
		System.out.println(claseP.atributoD);
		claseP.atributoD="un valor mas raro";
	//	claseP.MENSAJE= "IJOIFJFD";
		
		//instancia la clase hija
		
		ClaseHija claseH = new ClaseHija();
		claseH.imprimiMensaje();
		claseH.getAtributoB();
		claseH.getFechaActual();
		
		System.out.println(claseP.atributoD);
		
		//modificadores de acceso,public,private,protected

		ClasePrueba objeto = new ClasePrueba("ABCDF", 20, 30.6);
		objeto.atributoA = "ijfkifj"; //llamada al atributo de un 
		objeto.setAtributoA("otro valor"); //llamada mediante se
		System.out.println(claseP.atributoD);
		
		
		//LLAMADA AUN ATRIBUTO PRIVADO(NO FUNCIONA)
		//objeto.atributoB=10;
		
		objeto.setAtributoB(18);
		
		//protected
		objeto.atributoC= 334.55;
		
		System.out.println(claseP.multiplicar(2.7,8));
		System.out.println(claseP.multiplicar("60"));
		
		
	}
	
	

}
