package com;

public class Principal {

	public static void main(String[] args) {
		
		ClasePrueba claseP = new ClasePrueba("Hola", 20, 30.6);
		claseP.imprimirMensaje();
		
		claseP.getAtributoB();
		System.out.println(claseP.atributoD);
		claseP.atributoD = "un valor mas raro";
		//ClaseP.MENSAJE = "5y9uhj45"
		
		//Instancia de clase hija
		ClaseHija claseH = new ClaseHija();
		claseH.imprimirMensaje();
		claseH.getAtributoB();
		claseH.getFechaActual(); 
		
		System.out.println(claseH.atributoD);
		//Herencia solo se puede alcanzar de un nivel a un nivel superior
		
	/*	Persona p1 = new Persona ("Moreno", 22, "Antonio", "Masculino", "Mexicano");
		Profesionista pro1Profesionista = */
		
		
	//Modificadores de acceso public, private, protected
 
	ClasePrueba objeto = new ClasePrueba("ABCDF", 20, 30.6);	// delimitar el acceso de los atributos de la clase 
	objeto.atributoA = "sjaskal"; //llamada al atributo de clase
	objeto.setAtributoA("otro valor"); //llamada mediante setter 
	System.out.println(objeto.atributoD);
	//llamada a un atributo privado (no funciona)
	//objeto.atributoB=10;
	//claseP.atributoD ="un valor mas raro"; //
	
	objeto.setAtributoB(18);
	
	objeto.atributoC = 345.23;
	
	System.out.println(claseP.multiplicar(2.7,8));
	System.out.println(claseP.multiplicar("60"));
	
	
	} 
	//setter para llegarle 
	//getter para traerlo
	//El modificador private no permite la visibilidad de los miembros desde fuera de la clase
} //this me referencio dentro de la clase es cuando el atributo
	//protected hereda a otro paquete

//entrevista
//cual es el uso del operador static es definir atributos de clases, es decir atributos que compartan un  mismo valor no importando cuantas instancias se hagan de las clases
//cual es el uso del modificador final este operador designa la inmutabilidad en los atributos en donde se les anote 