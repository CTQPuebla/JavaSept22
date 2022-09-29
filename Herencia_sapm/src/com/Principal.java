package com;

public class Principal {
	
	public static void main (String[]args) {
		
		ClasePrueba claseP = new ClasePrueba ("Hola",20,30.6);
		
		claseP.imprimirMensaje();
		claseP.getAtributoB();
		
		System.out.println(claseP.atributoD);
		claseP.atributoD = "un valor mas raro";
		//es un atributo que no puede cambiar por el uso del modificador final
		//claseP.MENSAJE = "shgasyfs";
		
		//instancia de clase hija
		ClaseHija claseH = new ClaseHija();
		claseH.getAtributoB();
		claseH.imprimirMensaje();
		claseH.getFechaActual();
		
		System.out.println(claseH.atributoD);
		
//		Persona p1 =  new  b Persona("Morenoclaro","24","Shaddeis","no se sabe","gringa");
//		Profesionista per1 = new Profesionista("","");
//		per1.trabajar();
//		
		
		//modificadores de acceso,public ,private,protected
		ClasePrueba objeto =new ClasePrueba ("ABCDF",20,30.6);
		objeto.atributoA = "shaddeis";//llamada al atributo de clase 
		objeto.setAtributoA("otro valor");//llamada mediante setter
		System.out.println(objeto.atributoD);
		//delimitar el acceso de los atributos de la clase 
	    //set para llegar//get para salir 
		
		objeto.setAtributoB(18);
		
		objeto.atributoC= 345.23;
		
		System.out.println(claseP.multiplicar(2.7, 8));
		System.out.println(claseP.multiplicar("60"));
		
		
		
		
		
		//this me referencio  dentro de la clase es cuando el atributo es privado
		
		
	
	}//el modificador private no permite la visibilidad de los miembros desde fuerade la clase 
          //objeto.atributoB=10        //llamada a un atributo privado (no funciona)
}


//cual es el uso del modificador final: este operador designa la inmutabilidad en los atributos donde se les anote
//cual es el valor del operador static: es definir atributos de clase , es decir atributos que compartan un mismo valor no importando,cuantas instancias se hagan de la clase 