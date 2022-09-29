package com;

public class Herencia {
	public static void main(String[] args) {
		
		claseprueba claseP = new claseprueba("hola", 20, 30.6);
		claseP.ImprimirMensaje();
		
		claseP.getAtributoB();
		System.out.println(claseP.atributoD);
		
		claseP.getAtributoB();
		
		claseP.atributoD = "un valor mas raro";
		
		claseP.getAtributoB();
		//Instancia de clase hija
		clasehija claseH= new clasehija();
		claseH.ImprimirMensaje();
		claseH.getAtributoB();
		claseH.getFechaActual();
	
		System.out.println();
		
		//Modificaciones de acceso public,private,protected
		
		
	claseprueba objeto = new claseprueba ("ABCDF", 20, 30.6);
		objeto.atributoA = "huachu"; //llamada al atributo de clase
		objeto.setAtributoA("otro valor"); //llamada mediante setter
		
	//llamada a un atributo privao(no funciona)
	//objeto.atributoB=10;
		
		objeto.setAtributoB(18);
		
		objeto.atributoC = 345.23;
		
		
		
		System.out.println(claseP.multiplicar(2.7, 8));
		System.out.println(claseP.multiplicar("60"));
		
		
		
		
		
	}
	
	
	
	
	

}//main 

