package com;

public class Claseprincipal {
	public static void main(String[] args) {
		
		Claseprueba clasep=new Claseprueba("hola",20,30.6);
		clasep.ImprimirMensaje();
		
		
		
		
		clasep.getAtributosB();
		System.out.println(clasep.atributoD);
		clasep.atributoD="un valor mas raro";
//		clasep.MENSAJE="otro valor";// este atrivuto no puede cambiar
				
		
		
		//Instancia clase hija
		Clasehija claseh = new Clasehija();
		claseh.ImprimirMensaje();
		claseh.getAtributosB();
		claseh.getfechaActual();
		System.out.println(claseh.atributoD);
		
//		Persona pers1=new Persona(" blanco", "gregorio", "Acapulco", "Hombre", 27);
//		System.out.println(pers1);
//		Profecionista profe1=new Profecionista("blanco", "gregorio", "Acapulco", "Honbre", 27, "ingeniero", "titulo");
//		System.out.println(profe1);
		
		// modificaodres de acceso public,private,proyected
		
		Claseprueba objeto=new Claseprueba("ABCD",20,30.6);
		
		objeto.atributoA = "abcde";// llamada al atributo de clase
		
		objeto.setAtributoA("otro valor");// la manera correcta es con setter
		
		System.out.println(clasep.atributoD);
		
//		objeto.atributoB=10; llamada a un atributo privado(no funciona)
		
		objeto.setAtributosB(18);
		
		objeto.atributoC=345.23;
		System.out.println(clasep.multiplicar(2.7,8));
		System.out.println(clasep.multiplicar("60"));
	}


}//
