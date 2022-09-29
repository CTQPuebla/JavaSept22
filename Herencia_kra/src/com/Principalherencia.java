package com;

public class Principalherencia {
	public static void main(String[] args) {

		Claseprueba clasep = new Claseprueba("hola", 20, 30.6);
		clasep.imprimirMensaje();
		clasep.getTributoB();
	System.out.println(clasep.atributoD);
		clasep.atributoD= "un valor mas raro";
		
		//Instancia de clase hija
		Clasehija claseh = new Clasehija();
		claseh.imprimirMensaje();
		claseh.getTributoB();
		claseh.getfechaActual();
		System.out.println(claseh.atributoD);
		
		//Modificadores de Acceso PUBLIC, PRIVATE,PROTECTED
		
		Claseprueba objeto = new Claseprueba ("ABCDF", 20, 30.2);
		objeto.atributoA = "hola"; //llamada al atributo de clase
		objeto.setAtributoA("otro valor"); //llamada mediante setter
//		objeto.atributoA=10; //llamado a un atributo privado (no funciona) 
		System.out.println(Claseprueba.atributoD);
		objeto.setTributoB(18);
		
		objeto.atributoC = 345.23;
		
		
		
		System.out.println(clasep.multiplicar(2.7, 8));
		
		System.out.println(clasep.multiplicar("60"));
	}// main
}// publicclass
