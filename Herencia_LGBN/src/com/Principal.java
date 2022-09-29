package com;

public class Principal {
	
	public static void main(String[] args) { 
		
		Prueba p = new Prueba("HEY", 500, 15.36);
		p.ImprimirMensaje();
		System.out.println(p.at4);
		p.at4 = "un valor mas raro";
//		p.MENSAJE = "hola";
		p.getAt2();
		
		
		
//		INSTANCIA
		ClaseHija ClaH = new ClaseHija ();
		ClaH.getAt2();
		ClaH.ImprimirMensaje();
		System.out.println(ClaH.at4);
		ClaH.getfecha();
		
//		MODIFICADORES DE ACCESO (LIMITAR EL ACCESO A LOS ATRIBUTOS DE LAS CLASES)PUBLIC, PRIVATE, PROTECTED
		
		Prueba objeto = new Prueba("ABCDF", 500, 15.36);
		objeto.at1 = "gfdsjkjh"; //llamar y dar valor a un atributo
		objeto.setAt1("dhgfd"); //llamar y dar valor al atributo mediante SET
		System.out.println(objeto.at4);
//		objeto.at2=10; LLAMAR A UN ATRIBUTO PRIVADO DIRECTAMENTE NO FUNCIONA
		objeto.setAt2(500);
		objeto.setAt3(15.26);
		
		System.out.println(p.multiplicar(3.58, 8));
		System.out.println(p.multiplicar("60"));
	}

}
